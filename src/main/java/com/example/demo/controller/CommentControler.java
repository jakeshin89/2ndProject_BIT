package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.CommentVO;
import com.example.demo.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentControler {
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping("/list")
	@ResponseBody //json 형태로 data 전송해야 하기에 필요함
	private List<CommentVO> commentServiceList(){
		return commentService.commentList();
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	private int commentServiceInsert(@RequestParam("b_no") int b_no, @RequestParam("content") String content){
		
		CommentVO comment = new CommentVO();
		comment.setB_no(b_no);
		comment.setContent(content);
		comment.setWriter("test");
		
		return commentService.commentInsert(comment);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	private int commentServiceUpdateProc(@RequestParam("c_no") int c_no, @RequestParam String content){

		CommentVO comment = new CommentVO();
		comment.setC_no(c_no);
		comment.setContent(content);
		
		return commentService.commentUpdate(comment);
	}
	
	@RequestMapping("/delete/{c_no}")
	@ResponseBody
	private int commentServiceDelete(@PathVariable("c_no") int c_no){
		return commentService.commentDelete(c_no);
	}
}
