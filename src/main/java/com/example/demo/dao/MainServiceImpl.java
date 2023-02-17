package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MainMapper;
import com.example.demo.model.Product;


@Service //서비스임을 선언
public class MainServiceImpl implements MainService{

	@Autowired 
	private MainMapper mainMapper;

	@Override
	public List<Product> selectGetItemList(HashMap<String, Object> map) throws Exception {
		
		return mainMapper.selectGetItemList(map);
	}

	@Override
	public List<Product> searchArea(HashMap<String, Object> map) throws Exception {
		
		return mainMapper.searchArea(map);
	}

	@Override
	public List<Product> searchTitle(HashMap<String, Object> map) throws Exception {
		
		return mainMapper.searchTitle(map);
	}
	
	@Override
	public List<Product> selectGetMyItemList(HashMap<String, Object> map) throws Exception {
		
		return mainMapper.selectGetMyItemList(map);
	}

	@Override
	public String selectImg(int idx) throws Exception {
		// TODO Auto-generated method stub
		return mainMapper.selectImg(idx);
	}
	
	
}