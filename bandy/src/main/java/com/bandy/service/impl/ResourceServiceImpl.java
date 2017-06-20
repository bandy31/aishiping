package com.bandy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bandy.dao.ResourceDaoImpl;
import com.bandy.model.Resource;
import com.bandy.service.ResourceService;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {
	@Autowired
	private ResourceDaoImpl  resourceDaoImpl;
	
	public Resource getResourceById(Integer id) {
		return resourceDaoImpl.getById(id);
	}

	public List<Resource> getShowResource(Integer type) {
		return resourceDaoImpl.getResourcesByType(type);
	}
	
	
}
