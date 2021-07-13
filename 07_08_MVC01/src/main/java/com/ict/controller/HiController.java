package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HiController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("result");
		
		// 비즈니스 로직 처리(서비스 -> ServiceImpl -> DAO -> DAOImpl -> DB)

		// 데이터 저장
		request.setAttribute("name", "태권브이");
		request.getSession().setAttribute("age", 39);
		mv.addObject("addr", "서울시 여의도");
		
		return mv;
	}
}
