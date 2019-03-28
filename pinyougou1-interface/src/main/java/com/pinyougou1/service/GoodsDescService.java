package com.pinyougou1.service;

import com.pinyougou1.pojo.GoodsDesc;
import java.util.List;
import java.io.Serializable;
/**
 * GoodsDescService 服务接口
 * @date 2019-03-28 18:33:00
 * @version 1.0
 */
public interface GoodsDescService {

	/** 添加方法 */
	void save(GoodsDesc goodsDesc);

	/** 修改方法 */
	void update(GoodsDesc goodsDesc);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	GoodsDesc findOne(Serializable id);

	/** 查询全部 */
	List<GoodsDesc> findAll();

	/** 多条件分页查询 */
	List<GoodsDesc> findByPage(GoodsDesc goodsDesc, int page, int rows);

}