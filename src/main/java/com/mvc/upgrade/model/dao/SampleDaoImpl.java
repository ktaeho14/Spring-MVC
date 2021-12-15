package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.SampleDto;

@Repository
public class SampleDaoImpl implements SampleDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	@Override
	public List<SampleDto> selectList() {
		List<SampleDto> list = new ArrayList<SampleDto>();
			
		try {
			list = sqlSession.selectList("sample.selectList");
			System.out.println(list.size());
		} catch (Exception e) {
			System.out.println("error : [selectList]");
			e.printStackTrace();
		} 
		
		System.out.println(list);
		return list;
	}

	@Override
	public SampleDto selectOne(int spNo) {
		
		SampleDto dto = null;
		
		dto = sqlSession.selectOne("sample.selectOne",spNo);
		return dto;
	}

	@Override
	public int insert(SampleDto dto) {
		int res = 0;
		
		res = sqlSession.insert("sample.insert",dto);
		return res;
	}

	@Override
	public int update(SampleDto dto) {
		int res=0;
		
		res = sqlSession.update("sample.update",dto);
		return res;
	}

	@Override
	public int delete(int spNo) {
		int res = 0;
		res = sqlSession.delete("sample.delete",spNo);
		return res;
	}
	

	
}
