package com.hauphvnjavaweb.dao.impl;

import java.util.List;

import com.hauphvnjavaweb.dao.ICategoryDAO;
import com.hauphvnjavaweb.mapper.CategoryMapper;
import com.hauphvnjavaweb.model.CategoryMode;

public class CategoryDAO extends AbstractDAO implements ICategoryDAO {

	@Override
	public List<CategoryMode> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	public void insert() {
	}
}
