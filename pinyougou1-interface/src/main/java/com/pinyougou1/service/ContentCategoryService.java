package com.pinyougou1.service;

import com.pinyougou1.pojo.ContentCategory;
import java.util.List;
import java.io.Serializable;
/**
 * ContentCategoryService 服务接口
 * @date 2019-03-28 18:33:00
 * @version 1.0
 */
public interface ContentCategoryService {

	/** 添加方法 */
	void save(ContentCategory contentCategory);

	/** 修改方法 */
	void update(ContentCategory contentCategory);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	ContentCategory findOne(Serializable id);

	/** 查询全部 */
	List<ContentCategory> findAll();

	/** 多条件分页查询 */
	List<ContentCategory> findByPage(ContentCategory contentCategory, int page, int rows);

}