package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou1.mapper.SellerMapper;
import com.pinyougou1.pojo.Seller;
import com.pinyougou1.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
@Service(interfaceName = "com.pinyougou1.service.SellerService")
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerMapper sellerMapper;
    @Override
    public void save(Seller seller) {
        sellerMapper.insertSelective(seller);
    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Seller findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }

    @Override
    public List<Seller> findByPage(Seller seller, int page, int rows) {
        return null;
    }
}
