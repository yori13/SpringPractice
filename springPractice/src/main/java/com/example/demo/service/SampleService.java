package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.SampleEntity;
import com.example.demo.repository.SampleDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	
	public final SampleDao dao;
	
	public List<SampleEntity> getAllSample(){
		List<SampleEntity> sampleList = dao.selectAll();
		if(sampleList.size() == 0) {
			SampleEntity en = new SampleEntity();
			en.setId(0);
			en.setName("sample");
			sampleList.add(en) ;
			//asffwaef
		}
		return sampleList;
	}

}
