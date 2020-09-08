package com.mvc.upgrade.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mvc.upgrade.model.biz.BoardBiz;

@Controller
public class BoardController {

	@Autowired
	private BoardBiz boardBiz;
}
