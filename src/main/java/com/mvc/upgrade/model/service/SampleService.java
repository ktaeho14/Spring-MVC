package com.mvc.upgrade.model.service;

import java.util.List;

import com.mvc.upgrade.model.dto.SampleDto;

public interface SampleService {
	
	public List<SampleDto> selectList();
	public SampleDto selectOne(int spNo);
	public int insert(SampleDto dto);
	public int update(SampleDto dto);
	public int delete(int spNo);
	
}
