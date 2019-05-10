package com.hauphvnjavaweb.service;

import java.util.List;

import com.hauphvnjavaweb.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(Long categoryid);
	NewsModel save(NewsModel news);
	boolean modify(NewsModel news);
}
