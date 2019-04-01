package com.pinyougou1.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.pojo.Seller;
import com.pinyougou1.service.SellerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Reference(timeout = 10000)
    private SellerService sellerService;
    @PostMapping("/save")
    public boolean saveSeller(@RequestBody Seller seller){
        try {
            sellerService.save(seller);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
