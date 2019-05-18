package con.hauphvnjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.hauphvnjavaweb.dao.INewDAO;
import com.hauphvnjavaweb.dao.impl.NewsDAO;
import com.hauphvnjavaweb.model.NewsModel;
import com.hauphvnjavaweb.paging.Pageble;
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
		news.setCreateDate(new Timestamp(System.currentTimeMillis()));
		news.setCreatedBy("Tac gia chinh");
		news.setModifiedBy("");
		news.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		Long id = newsDAO.save(news);
		return new NewsDAO().findOne(id);
	}
	
	@Override
	public NewsModel update(NewsModel newNews) {
		NewsModel oldNews = newsDAO.findOne(newNews.getId());
		newNews.setCreateDate(oldNews.getCreateDate());
		newNews.setCreatedBy(oldNews.getCreatedBy());
		newNews.setModifiedBy("Tac gia chinh sua");
		newNews.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		newsDAO.update(newNews);
		return newsDAO.findOne(newNews.getId());
		
	}

	@Override
	public void delete(long[] ids) {
		for(long id : ids) {
			newsDAO.delete(id);
		}
		
	}

	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		return newsDAO.findAll(pageble);
	}

	@Override
	public int count() {
		return newsDAO.countItem();
	}
}
	