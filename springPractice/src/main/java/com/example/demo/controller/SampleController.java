package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.SampleEntity;
import com.example.demo.service.SampleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {
	
	private final SampleService service;

	/**
	 * @param model コントローラーからビュー（HTMLなど）にデータを渡すための入れ物です。
	 * @return templateフォルダ配下にあるhtmlファイルを返します。
	 * 			拡張子を除いたファイル名を指定します。
	 */
	@GetMapping("/")
	public String getSample(Model model) {
		/*
		 * 第一引数にkey。
		 * 第二引数にvalue。
		 */
		model.addAttribute("message", "ようこそ");
		//htmlファイルを指定
		return "sample";
	}
	
	@PostMapping("/sample")
	public String postSample(Model model) {
		
		List<SampleEntity> entity = service.getAllSample();
		model.addAttribute("samples", entity);
		return "sample2";
	}
}
