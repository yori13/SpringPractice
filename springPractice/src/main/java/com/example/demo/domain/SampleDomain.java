package com.example.demo.domain;

/**
 * SampleDomain は、アプリケーションのビジネスルールに関わるドメインオブジェクトです。
 * SampleEntity から変換されて利用されることを想定しています。
 * Serviceで処理過多になることを防いでくれます。
 * 正直今回のプロジェクトでは使わない可能性があります。
 */
public class SampleDomain {

    private final Integer id;
    private final String name;
    
    /**
     * SampleDomain のコンストラクタ。
     * 
     * @param id   ユーザーのID（null不可）
     * @param name ユーザー名（null不可）
     * @throws IllegalArgumentException IDまたはnameがnullの場合
     */
    public SampleDomain(Integer id, String name) {
        if (id == null || name == null) {
            throw new IllegalArgumentException("IDと名前はnullであってはなりません");
        }
        this.id = id;
        this.name = name;
    }
}
