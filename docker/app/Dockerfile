# ベースイメージの指定
FROM openjdk:17

# ワーキングディレクトリ設定
WORKDIR /app

#Jarファイルをコンテナにコピー
COPY springPractice/build/libs/springPractice-0.0.1-SNAPSHOT.jar app.jar

# アプリケーションの実行コマンド
ENTRYPOINT ["java", "-jar", "app.jar"]