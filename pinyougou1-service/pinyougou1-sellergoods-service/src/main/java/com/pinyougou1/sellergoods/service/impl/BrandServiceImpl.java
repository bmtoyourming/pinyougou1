package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.mapper.BrandMapper;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
@Service(interfaceName="com.pinyougou1.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public void save(Brand brand) {
        brandMapper.insertSelective(brand);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {
       try {
           brandMapper.deleteAll(ids);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public Brand findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Brand> findAll() {

        return brandMapper.selectAll();

    }

    /**
     * 这是多条件或者没条件分页查询
     * @param brand
     * @param page
     * @param rows
     * @return
     */
    @Override
    public PageResult findByPage(Brand brand, int page, int rows) {
        try {
            PageInfo<Brand> brandList = PageHelper.startPage(page, rows).doSelectPageInfo(new ISelect() {
                @Override
                public void doSelect() {
                    brandMapper.findBrandByPages(brand);
                }
            });
            return new PageResult(brandList.getTotal(),brandList.getList());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
        //如果不加异常的话,假如请求不加参数的话就会报错
    }
}
