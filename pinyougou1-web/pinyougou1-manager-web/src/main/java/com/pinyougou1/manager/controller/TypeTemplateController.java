package com.pinyougou1.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.TypeTemplate;
import com.pinyougou1.service.TypeTemplateService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typeTemplate")
public class TypeTemplateController {
    @Reference(timeout = 10000)
    private TypeTemplateService typeTemplateService;

    @GetMapping("/findAll")
    public PageResult findSpecificationByPage(TypeTemplate typeTemplate, int pageNum, int pageSize){
         try{
                     if (StringUtils.isNoneBlank(typeTemplate.getName())){
                         typeTemplate.setName(new String(typeTemplate.getName().getBytes("ISO8859-1"), "UTF-8"));
                     }
                 }catch (Exception ex){
                     ex.printStackTrace();
                 }
        return typeTemplateService.findByPage(typeTemplate,pageNum,pageSize);
    }
    @PostMapping("/save")
    public boolean save(@RequestBody TypeTemplate typeTemplate){
        try {
            typeTemplateService.save(typeTemplate);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }
    @PostMapping("/update")
    public boolean update(@RequestBody TypeTemplate typeTemplate){
        try {
            typeTemplateService.update(typeTemplate);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    @GetMapping("/delete")
    public boolean delete(Long[] ids){
        try {
            typeTemplateService.deleteAll(ids);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
