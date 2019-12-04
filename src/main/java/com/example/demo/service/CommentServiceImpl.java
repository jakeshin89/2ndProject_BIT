package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.CommentVO;
import com.example.demo.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentMapper commentMapper;

	@Override
	public List<CommentVO> commentList() {
		return commentMapper.commentList();
	}

	@Override
	public int commentInsert(CommentVO comment) {
		return commentMapper.commentInsert(comment);
	}

	@Override
	public int commentUpdate(CommentVO comment) {
		return commentMapper.commentUpdate(comment);
	}

	@Override
	public int commentDelete(int c_no) {
		return commentMapper.commentDelete(c_no);
	}

}
