package com.hauphvnjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hauphvnjavaweb.model.CategoryMode;

public class CategoryMapper implements RowMapper<CategoryMode>{

	@Override
	public CategoryMode mapRow(ResultSet resultSet) {
		CategoryMode categoryMode = new CategoryMode();
		try {
			categoryMode.setId(resultSet.getLong("id"));
			categoryMode.setName(resultSet.getString("name"));
			categoryMode.setCode(resultSet.getString("code"));
			return categoryMode;
		} catch (SQLException e) {
			return null;
		}
		
	}

}
