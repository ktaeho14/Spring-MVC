package com.mvc.upgrade.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.SampleDao;
import com.mvc.upgrade.model.dto.SampleDto;

@Service
public class SampleServiceImpl implements SampleService{

	@Autowired
	private SampleDao dao;
	
	@Override
	public List<SampleDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public SampleDto selectOne(int spNo) {
	
		return dao.selectOne(spNo);
	}

	@Override
	public int insert(SampleDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(SampleDto dto) {
		
		return dao.update(dto);
	}

	@Override
	public int delete(int spNo) {
		
		return dao.delete(spNo);
	}
	
	
}
