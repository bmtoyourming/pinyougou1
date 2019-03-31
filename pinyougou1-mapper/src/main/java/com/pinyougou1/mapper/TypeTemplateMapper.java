package com.pinyougou1.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou1.pojo.TypeTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * TypeTemplateMapper 数据访问接口
 * @date 2019-03-28 18:27:30
 * @version 1.0
 */
public interface TypeTemplateMapper extends Mapper<TypeTemplate>{
    /**
     * 查询全部模板信息
     * @return
     */

    List<TypeTemplate> findAll(TypeTemplate typeTemplate);

    /**
     * 根据可变id删除数据
     * @param ids
     */
    void deleteAll(Serializable ids);
}