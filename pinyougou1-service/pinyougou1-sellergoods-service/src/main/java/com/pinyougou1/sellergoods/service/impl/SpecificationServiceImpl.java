package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou1.pojo.Specification;
import com.pinyougou1.service.SpecificationService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service(interfaceName = "com.pinyougou1.service.SpecificationService")
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

    @Override
    public void save(Specification specification) {

    }

    @Override
    public void update(Specification specification) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Specification findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Specification> findAll() {
        return null;
    }

    @Override
    public List<Specification> findByPage(Specification specification, int page, int rows) {
        return null;
    }
}
