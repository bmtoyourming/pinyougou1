package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.pojo.ItemCat;
import com.pinyougou1.service.ItemCatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itemCat")
public class ItemCatConlltroller {
    @Reference(timeout = 10000)
    private ItemCatService itemCatService;
    @GetMapping("/find")
    public List<ItemCat> findAllById(int parent_id){
        return itemCatService.findItemCatById(parent_id);
    }
}
