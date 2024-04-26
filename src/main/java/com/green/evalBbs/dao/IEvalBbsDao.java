package com.green.evalBbs.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {

	public List<EvalBbsDto> evallist();
	public EvalBbsDto evaldetail(@Param("bno") String bno);
	public void evalinsert(@Param("title") String title, @Param("content") String content, @Param("writer") String writer, @Param("regdate") String reagdate );
	public void evaldelete(@Param("bno") String bno);
	
}
