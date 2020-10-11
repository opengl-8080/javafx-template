# javafx-template
JavaFXアプリのテンプレートプロジェクト。

## 実行
```
$ gradlew run
```

## ビルド
```
$ gradlew jlink
```

`build/image` の下に、カスタムランタイムが出力される(約100MB)。  
`build/image/bin/javafx-template` を実行すると、アプリケーションが起動する。
