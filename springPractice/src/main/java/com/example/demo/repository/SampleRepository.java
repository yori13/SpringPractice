package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SampleEntity;

/**
 * SampleDao は、SampleEntity に対するデータベースアクセス操作を定義するインターフェースです。
 */

public interface SampleRepository extends JpaRepository<SampleEntity, Integer> {

    /**
     * 全レコードを取得します。
     *
     * @return SampleEntity のリスト
     */

	List<SampleEntity> findAll();
}
