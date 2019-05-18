package com.hauphvnjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hauphvnjavaweb.model.NewsModel;
import com.hauphvnjavaweb.model.UserModel;
import com.hauphvnjavaweb.service.ICategoryService;
import com.hauphvnjavaweb.service.INewService;

@WebServlet(urlPatterns = "/trang-chu")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = -1569707547782560482L;
	@Inject
	private ICategoryService categoryService;
	@Inject
	private INewService newsService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Long categoryId = 1L;
//		Long id = 10L;
//		String title = "Bài viết thể thao 15";
//		NewsModel newsModel = new NewsModel();
//		newsModel.setId(id);
//		newsModel.setTitle(title);
//		req.setAttribute("newsService", newsService.modify(newsModel));
//		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
//		rd.forward(req, resp);
	}

	@Override 	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
