package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.service.BrandService;


import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 10000)
    private BrandService brandService;
    @GetMapping("/findAll")
    public PageResult findAll(Brand brand,@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "5") int pageSize){
         try{
             if (StringUtils.isNoneBlank(brand.getName())){
                 brand.setName(new String(brand.getName().getBytes("ISO8859-1"), "UTF-8"));
             }
         }catch (Exception ex){
             ex.printStackTrace();
         }
        return brandService.findByPage(brand,pageNum,pageSize);
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
    @GetMapping("/delete")
    public boolean deleteBrand(Long[] ids){
        try {
            brandService.deleteAll(ids);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
