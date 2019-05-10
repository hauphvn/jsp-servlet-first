package com.hauphvnjavaweb.dao;

import java.util.List;

import com.hauphvnjavaweb.model.CategoryMode;

public interface ICategoryDAO extends GenericDAO{
	List<CategoryMode> findAll();
}
