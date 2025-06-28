package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {

	/**
	 * @param model コントローラーからビュー（HTMLなど）にデータを渡すための入れ物です。
	 * @return templateフォルダ配下にあるhtmlファイルを返します。
	 * 			拡張子を除いたファイル名を指定します。
	 */
	@GetMapping("/")
	public String sample(Model model) {
		/*
		 * 第一引数にkey。
		 * 第二引数にvalue。
		 */
		model.addAttribute("message", "ようこそ");
		//htmlファイルを指定
		return "sample";
	}
}
