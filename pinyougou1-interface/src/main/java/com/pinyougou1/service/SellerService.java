package com.pinyougou1.service;

import com.pinyougou1.pojo.Seller;
import java.util.List;
import java.io.Serializable;
/**
 * SellerService 服务接口
 * @date 2019-03-28 18:33:00
 * @version 1.0
 */
public interface SellerService {

	/** 添加方法 */
	void save(Seller seller);

	/** 修改方法 */
	void update(Seller seller);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	Seller findOne(Serializable id);

	/** 查询全部 */
	List<Seller> findAll();

	/** 多条件分页查询 */
	List<Seller> findByPage(Seller seller, int page, int rows);

}