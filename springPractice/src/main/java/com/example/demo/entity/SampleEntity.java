package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


/**
 * SampleEntity は、DB テーブルのレコードを表すエンティティクラスです。
 */
@Entity
@Table(name = "sample")
public class SampleEntity {

	/** プライマリキーID */
	@Id
	Integer id;
	
	String name;

}
