package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz memberBiz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("[loginform.do]");
		return "mvclogin";
	}
	/*
	 * @ResponseBody : java 객체를 response 객체의 데이터로 "binding" 
	 * @RequestBody : request 객체 담겨져서 넘어오는 데이터를 
	 * 					java 객체에 binding(묶어주는,연결해주는)
	 */
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	//ajax로 요청, 새로운 view를 응답시키면 안돼(비동기니까)
	//@ResponseBody 걸려있으면 View를 찾지 않는다, 바로 자바 객체로 응답
	//map으로 return한걸 @ResponseBody(pom.xml에 추가한 jackson 디펜던시2개)가 json형태로 바꿔줌 
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(@RequestBody MemberDto dto, HttpSession session){
		//@RequestBody는 json으로 request된 애들 MemberDto dto랑 binding해줘서
		//dto에값을 넣어준다 맞나요

		logger.info("[ajaxlogin.do]");
		
		MemberDto res = memberBiz.login(dto);
		
		boolean check = false;
		if(res != null) {
			session.setAttribute("login", res);
			check = true;
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}
}
