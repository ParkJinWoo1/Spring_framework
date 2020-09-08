package com.mvc.upgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

@Controller
public class BoardController {
	
	@Autowired
	private BoardBiz boardBiz;
	
	
	@RequestMapping(value="/list.do")
	public String selectList(Model model) {
		
		model.addAttribute("list", boardBiz.selectList());
		System.out.println("[list.do]");
		
		return "mvclist";
	}
	
	//앞에 루트 안써되 되긴함! 루트 쓰는게 좋음!!
	@RequestMapping(value="/detail.do")
	public String selectOne(Model model, @RequestParam("myno")int myno) {
		System.out.println("[detail.do]");
		
		model.addAttribute("dto", boardBiz.selectOne(myno));
		
		return "mvcdetail";
	}
	
	@RequestMapping(value="/insert.do")
	public String insert() {
		System.out.println("[insert.do]");
		
		return "mvcinsert";
	}
	
	@RequestMapping(value="/insertres.do")
	//command객체(=BoardDto)
	public String insertres(BoardDto dto, Model model) {
		System.out.println("[insertres.do]");
		
		int res = boardBiz.insert(dto);
		if(res > 0) {
			//(2줄)이렇게 하고 글작성하고 새로고침하면 계속 생김.!! 쓰지말기$!!
			//model.addAttribute("list", boardBiz.selectList());
			//return "mvclist";
			
			//이렇게 쓰기!!
			return "redirect:list.do";
		}
		
		return "mvcinsert";
	}
	
	@RequestMapping(value="/update.do")
	public String update(Model model, int myno) {
		System.out.println("[UPDATE]");
		
		BoardDto dto = boardBiz.selectOne(myno);
		model.addAttribute("dto",dto);
		
		return "mvcupdate";
	}
	
	@RequestMapping(value="/updateres.do", method=RequestMethod.POST)
	public String updateRes(BoardDto dto, Model model) {
		System.out.println("[UPDATERES]");
		
		int res = boardBiz.update(dto);
		if(res > 0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}
		
		return "redirect:update.do?myno="+dto.getMyno();
	}
	
	@RequestMapping(value="/delete.do")
	public String delete(int myno) {
		System.out.println("[DELETE]");
		
		int res = boardBiz.delete(myno);
		if(res > 0) {
			return "redirect:list.do";
		}
		return "redirect:detail.do?myno="+myno;
	}
}
