package com.bandy.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class BaseDao<T> {

	protected Class<T> entityClass;
	
	@Resource
	private SessionFactory sessionFactory;

	public BaseDao() {
		Type type = getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType)
			entityClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}

	public T getById(Integer id) {
		return (T) getSession().get(entityClass, id);
	}

	public List<T> getListBySql(String sql, Object... pObjects) {
        SQLQuery query = getSession().createSQLQuery(sql);
        setParams(query, pObjects);
        query.addEntity(entityClass);
		return query.list();
	}

	public void setParams(Query query, Object[] params) {
		String pName;
		int n = 1;
		for (Object object : params) {
			pName = "p" + (n++);
			if (object instanceof Integer)
				query.setInteger(pName, (Integer) object);
			if (object instanceof String)
				query.setString(pName, (String) object);
			if (object instanceof Date)
				query.setTimestamp(pName, (Date) object);
			if (object instanceof Double)
				query.setDouble(pName, (Double) object);
			else 
				query.setParameter(pName,object);
		}
	}
}