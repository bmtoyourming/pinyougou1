package com.pinyougou1.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou1.pojo.ItemCat;

import java.util.List;

/**
 * ItemCatMapper 数据访问接口
 * @date 2019-03-28 18:27:30
 * @version 1.0
 */
public interface ItemCatMapper extends Mapper<ItemCat>{

    @Select("select * from tb_item_cat where parent_id = #{parent_id}")
    List<ItemCat> findItemCatById(int parent_id);

}