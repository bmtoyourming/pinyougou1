package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.service.BrandService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 10000)
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        System.out.println(brandService);
        return brandService.findAll();
    }
}
