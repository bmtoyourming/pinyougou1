package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.service.BrandService;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 10000)
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    @PostMapping("/save")
    public boolean addBrand(@RequestBody Brand brand){
        try {
            brandService.save(brand);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    @PostMapping("/update")
    public boolean updateBrand(@RequestBody Brand brand){
        try {
            brandService.update(brand);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
