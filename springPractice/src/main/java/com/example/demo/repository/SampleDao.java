package com.example.demo.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.example.demo.entity.SampleEntity;

/**
 * SampleDao は、SampleEntity に対するデータベースアクセス操作を定義するインターフェースです。
 */
@Dao
public interface SampleDao {

    /**
     * 全レコードを取得します。
     *
     * @return SampleEntity のリスト
     */
	@Select
	List<SampleEntity> selectAll();
}
