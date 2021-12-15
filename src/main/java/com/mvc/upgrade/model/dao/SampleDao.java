package com.mvc.upgrade.model.dao;

import java.util.List;

import com.mvc.upgrade.model.dto.SampleDto;

public interface SampleDao {
	
	String NAMESPACE="sample.";
	
	public List<SampleDto> selectList();
	public SampleDto selectOne(int spNo);
	public int insert(SampleDto dto);
	public int update(SampleDto dto);
	public int delete(int spNo);
	
}
