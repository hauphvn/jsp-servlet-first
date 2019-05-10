package con.hauphvnjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hauphvnjavaweb.dao.INewDAO;
import com.hauphvnjavaweb.model.NewsModel;
import com.hauphvnjavaweb.service.INewService;

public class NewService implements INewService{

	@Inject 
	private INewDAO newsDAO;

	@Override
	public List<NewsModel> findByCategoryId(Long categoryid) {
		return newsDAO.findByCategoryId(categoryid);
	}

	@Override
	public NewsModel save(NewsModel news) {
		Long id = newsDAO.save(news);
		System.out.println("Id vua moi insert: "+ id);
		return null;
	}
	
	public boolean modify(NewsModel news) {
		return newsDAO.update(news);
	}
}
	