package con.hauphvnjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hauphvnjavaweb.dao.ICategoryDAO;
import com.hauphvnjavaweb.model.CategoryMode;
import com.hauphvnjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<CategoryMode> findAll() {
		return categoryDAO.findAll();
	}

}
