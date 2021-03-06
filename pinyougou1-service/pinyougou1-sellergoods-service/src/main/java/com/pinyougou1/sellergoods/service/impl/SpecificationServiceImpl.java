package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.mapper.SpecificationMapper;
import com.pinyougou1.mapper.SpecificationOptionMapper;
import com.pinyougou1.pojo.Specification;
import com.pinyougou1.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service(interfaceName = "com.pinyougou1.service.SpecificationService")
@Transactional
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;
    @Autowired
    private SpecificationOptionMapper specificationOptionMapper;
    @Override
    public void save(Specification specification) {
        specificationMapper.save(specification);
        specificationOptionMapper.saveOption(specification);
    }
    @Override
    public PageResult findAll(Specification specification, int pageNum, int pageSize) {
         PageInfo<Specification> list = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(new ISelect() {
                     @Override
                     public void doSelect() {
                         specificationMapper.findAll(specification);
                     }
                 });
         return new PageResult(list.getTotal(),list.getList());

    }
}
