package com.hauphvnjavaweb.dao;

import java.util.List;

import com.hauphvnjavaweb.mapper.RowMapper;

public interface GenericDAO {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameter);
	boolean update(String sql, Object...parameters);
	Long insert(String sql, Object...parameters);
}
