# 20170830

## ScalableLayout

안드로이드는 화면의 크기가 맨날 달라지는데 그때마다 일관성 있는 UI를 표현하기 위한 라이브러리.

한국인이 만들었다. !!

SalableLayout 을 최상위 레이아웃으로 두지말고 Linear,RelativeLayout 등을 최상위로 두고 그 안에 ScalableLayout을 사용



#### 사용하기

build.gradle에 추가

```
dependencies {
  compile 'com.ssomai:android.scalablelayout:2.1.1'
}
```

