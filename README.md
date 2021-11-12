インフラ検証用のサンプルアプリケーション

`localhost:8080/greeting`でHelloWorld!!の文字列を返すだけ

### docker
```aidl
$ docker build -t masanami/greeting-docker .
$  docker run -p 8080:8080 masanami/greeting-docker
```
