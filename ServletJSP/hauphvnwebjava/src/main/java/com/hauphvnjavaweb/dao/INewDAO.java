package com.hauphvnjavaweb.dao;

import java.util.List;

import com.hauphvnjavaweb.model.NewsModel;

public interface INewDAO extends GenericDAO{
	List<NewsModel> findByCategoryId(Long categoryid);
	Long save(NewsModel news);
	boolean update(NewsModel news);
}
