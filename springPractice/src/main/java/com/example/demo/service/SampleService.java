package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.SampleEntity;
import com.example.demo.repository.SampleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	
	public final SampleRepository dao;
	
	public List<SampleEntity> getAllSample(){
		List<SampleEntity> sampleList = dao.findAll();
		return sampleList;
	}

}
