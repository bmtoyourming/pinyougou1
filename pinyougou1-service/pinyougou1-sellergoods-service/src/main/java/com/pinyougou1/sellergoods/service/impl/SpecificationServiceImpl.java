package com.pinyougou1.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Specification;
import com.pinyougou1.service.SpecificationService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service(interfaceName = "com.pinyougou1.service.SpecificationService")
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

}
