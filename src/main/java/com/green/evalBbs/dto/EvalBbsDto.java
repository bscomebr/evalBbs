package com.green.evalBbs.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvalBbsDto {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	
}
