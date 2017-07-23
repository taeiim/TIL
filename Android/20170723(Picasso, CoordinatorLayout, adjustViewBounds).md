# 20170723

## Picasso Library

이미지 로드 라이브러리

외부 링크로 저장된 이미지를 디스플레이 하는 데 효과적

1. build.gradle 에 추가

```
depencies{
  compile 'com.squareup.picasso:picasso:2.5.2'
}
```

2. 메니페스트에서 인터넷 사용할 수 있도록 퍼미션 추가

```
<uses-permission android:name="android.permission.INTERNET"/>
```



## CoordinatorLayout

### 사용하기

coordinatorLayout은 기본 API가 아닌 support design widget이다.

1. build.gradle 에 추가

```
dependecies{
  compile 'com.android.support:design:26.+'
}
```

2. Layout 사용

```xml
<android.support.design.widget.CoordinatorLayout 

</android.support.design.widget.CoordinatorLayout>
```



## ImageView 속성

### adjustViewBounds

```xml
android:adjustViewBounds="true"
```

이미지가 표현하고자 하는 레이아웃보다 클 때 비율유지 여부