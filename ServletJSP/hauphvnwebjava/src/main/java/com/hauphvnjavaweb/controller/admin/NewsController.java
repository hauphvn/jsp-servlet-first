package com.hauphvnjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hauphvnjavaweb.constant.SystemConstant;
import com.hauphvnjavaweb.model.NewsModel;
import com.hauphvnjavaweb.paging.PageRequest;
import com.hauphvnjavaweb.paging.Pageble;
import com.hauphvnjavaweb.service.INewService;
import com.hauphvnjavaweb.sort.Sorter;
import com.hauphvnjavaweb.utils.FormUtil;

@WebServlet (urlPatterns = "/admin-news")
public class NewsController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1569707547782560482L;
	
	@Inject
	private INewService newsService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NewsModel newsModel = new NewsModel();
		newsModel = FormUtil.toModel(NewsModel.class, req);
		Pageble pageble = new PageRequest(newsModel.getPage(), newsModel.getMaxItem(), new Sorter(newsModel.getSortName(), newsModel.getSortBy()));
		newsModel.setTotalItems(newsService.count());
		newsModel.setTotalPage((int)Math.ceil((double)newsModel.getTotalItems() / newsModel.getMaxItem()));
		newsModel.setListResult(newsService.findAll(pageble));	
		req.setAttribute(SystemConstant.MODEL, newsModel);
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/news/list.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
