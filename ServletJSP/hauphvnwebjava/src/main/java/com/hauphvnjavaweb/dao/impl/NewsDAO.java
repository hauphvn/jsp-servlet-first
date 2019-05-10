package com.hauphvnjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.hauphvnjavaweb.dao.INewDAO;
import com.hauphvnjavaweb.mapper.NewsMapper;
import com.hauphvnjavaweb.model.NewsModel;
import com.mysql.cj.protocol.Resultset;

public class NewsDAO extends AbstractDAO implements INewDAO {

	@Override
	public List<NewsModel> findByCategoryId(Long categoryid) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryid);
	}

	@Override
	public Long save(NewsModel news) {
		String sql = "INSERT INTO news(title,categoryid) VALUES(?,?)";
		return insert(sql, news.getTitle(),news.getCategoryId());
	}

	@Override
	public boolean update(NewsModel news) {
		String sql = "UPDATE news SET title = ? WHERE id = ?";
		return update(sql, news.getTitle(), news.getId());
		
	}
}
