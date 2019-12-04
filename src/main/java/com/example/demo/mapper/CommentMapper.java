package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.CommentVO;

@Mapper
public interface CommentMapper {

	int commentCount();
	
	List<CommentVO> commentList();
	
	int commentInsert(CommentVO comment);
	
	int commentUpdate(CommentVO comment);
	
	int commentDelete(int c_no);

}