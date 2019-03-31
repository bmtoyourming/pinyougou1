package com.pinyougou1.mapper;

import com.pinyougou1.pojo.Specification;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou1.pojo.SpecificationOption;

/**
 * SpecificationOptionMapper 数据访问接口
 * @date 2019-03-28 18:27:30
 * @version 1.0
 */
public interface SpecificationOptionMapper extends Mapper<SpecificationOption>{

    void saveOption(Specification specification);
}