package com.example.demo.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVO {

	private int c_no;
	private int b_no;
	private String content;
	private String writer;
	private Date reg_date;
	
}