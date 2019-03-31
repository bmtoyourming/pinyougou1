package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.mapper.TypeTemplateMapper;
import com.pinyougou1.pojo.TypeTemplate;
import com.pinyougou1.service.TypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
@Service(interfaceName = "com.pinyougou1.service.TypeTemplateService")
@Transactional
public class TypeTemplateServiceImpl implements TypeTemplateService {
    @Autowired
    private TypeTemplateMapper typeTemplateMapper;
    @Override
    public void save(TypeTemplate typeTemplate) {

    }

    @Override
    public void update(TypeTemplate typeTemplate) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public TypeTemplate findOne(Serializable id) {
        return null;
    }

    @Override
    public List<TypeTemplate> findAll(TypeTemplate typeTemplate) {
        return typeTemplateMapper.findAll(typeTemplate);
    }

    @Override
    public PageResult findByPage(TypeTemplate typeTemplate, int page, int rows) {
         PageInfo<TypeTemplate> list = PageHelper.startPage(page, rows).doSelectPageInfo(new ISelect() {
                     @Override
                     public void doSelect() {
                        typeTemplateMapper.findAll(typeTemplate);
                     }
                 });
         //封装为pageResult
        return new PageResult(list.getTotal(),list.getList());
    }
}
