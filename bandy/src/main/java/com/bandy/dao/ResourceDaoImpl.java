package com.bandy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.bandy.model.Resource;

@Repository
public class ResourceDaoImpl extends BaseDao<Resource> {
	/*
	 * 根据资源类型获取资源
	 * 
	 */
	public List<Resource> getResourcesByType(Integer type){
		String sql = "select * from resource where type=:p1 and valid=:p2";
		return getListBySql(sql, type,1);
	}

}
