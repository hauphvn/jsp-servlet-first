package com.hauphvnjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hauphvnjavaweb.model.NewsModel;

public class NewsMapper implements RowMapper<NewsModel>{

	@Override
	public NewsModel mapRow(ResultSet resultSet) {
			NewsModel newsMode = new NewsModel();
			try {
				newsMode.setId(resultSet.getLong("id"));
				newsMode.setTitle(resultSet.getString("title"));
				return newsMode;
			} catch (SQLException e) {
				return null;
			}
	}

}
