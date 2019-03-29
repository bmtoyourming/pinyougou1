package com.pinyougou1.mapper;

import tk.mybatis.mapper.common.Mapper;

import com.pinyougou1.pojo.Brand;

import java.util.List;

/**
 * BrandMapper 数据访问接口
 * @date 2019-03-28 18:27:30
 * @version 1.0
 */
public interface BrandMapper extends Mapper<Brand>{


    List<Brand> findBrandByPages(Brand brand);
}