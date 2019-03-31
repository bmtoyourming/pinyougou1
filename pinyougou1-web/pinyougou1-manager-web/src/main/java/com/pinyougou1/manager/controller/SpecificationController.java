package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Specification;
import com.pinyougou1.service.SpecificationService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Specification")
public class SpecificationController {
    @Reference(timeout = 10000)
    private SpecificationService specificationService;



}
