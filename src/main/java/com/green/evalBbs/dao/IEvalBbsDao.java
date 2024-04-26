package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {

	public List<EvalBbsDto> evallist();
	
}
