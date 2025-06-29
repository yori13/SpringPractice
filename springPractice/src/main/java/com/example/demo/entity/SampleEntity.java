package com.example.demo.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import lombok.Getter;
import lombok.Setter;


/**
 * SampleEntity は、DB テーブルのレコードを表すエンティティクラスです。
 */
@Entity
@Setter
@Getter
public class SampleEntity {

	/** プライマリキーID */
	@Id
	Integer id;
	
	String name;
}
