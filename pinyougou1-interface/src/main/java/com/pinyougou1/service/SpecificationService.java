package com.pinyougou1.service;

import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Specification;
import java.util.List;
import java.io.Serializable;
/**
 * SpecificationService 服务接口
 * @date 2019-03-28 18:33:00
 * @version 1.0
 */
public interface SpecificationService {
    /**
     * 插入一条数据
     * @param specification
     */
    void save(Specification specification);

    PageResult findAll(Specification specification,int pageNum,int pageSize);

}