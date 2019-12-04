package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.CommentVO;

public interface CommentService {

	List<CommentVO> commentList();
	
	int commentInsert(CommentVO comment);
	
	int commentUpdate(CommentVO comment);
	
	int commentDelete(int c_no);
	
}
