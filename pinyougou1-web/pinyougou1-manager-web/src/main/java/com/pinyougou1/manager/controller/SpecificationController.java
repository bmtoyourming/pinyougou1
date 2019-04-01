package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Specification;
import com.pinyougou1.service.SpecificationService;


import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Specification")
public class SpecificationController {
    @Reference(timeout = 10000)
    private SpecificationService specificationService;

    @PostMapping("/save")
    public boolean save(@RequestBody Specification specification){
        try {
            specificationService.save(specification);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    @GetMapping("/findAll")
    public PageResult findAll(Specification specification,int pageNum,int pageSize){
        return specificationService.findAll(specification,pageNum,pageSize);
    }

}
