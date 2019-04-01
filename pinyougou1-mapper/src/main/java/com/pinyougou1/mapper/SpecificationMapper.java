package com.pinyougou1.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou1.pojo.Specification;

import java.util.List;

/**
 * SpecificationMapper 数据访问接口
 * @date 2019-03-28 18:27:30
 * @version 1.0
 */
public interface SpecificationMapper extends Mapper<Specification>{

    void save(Specification specification);

    List<Specification> findAll(Specification specification);

}