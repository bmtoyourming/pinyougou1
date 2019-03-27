package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
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
        return brandMapper.findAll();
    }
}
