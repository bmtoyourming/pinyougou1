package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou1.mapper.BrandMapper;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(interfaceName="com.pinyougou1.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> findAll() {
        PageInfo<Brand> pageInfo =
                PageHelper.startPage(2,10).
                        doSelectPageInfo(new ISelect() {
                            @Override
                            public void doSelect() {
                                brandMapper.selectAll();
                            }
                        });
        System.out.println("总记录数:"+pageInfo.getTotal());
        System.out.println("总页数:"+pageInfo.getPages());
        return pageInfo.getList();
    }
}
