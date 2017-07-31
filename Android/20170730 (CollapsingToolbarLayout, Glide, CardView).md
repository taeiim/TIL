# 20170731

## CollapsingToolbarLayout

기본 API가 아닌 support design widget이다.

gradle에 design을 추가해줘야 사용할 수 있다.

```
dependencies{
  compile 'com.android.support:design:26.+'
}
```



#### scrollFlags

- scroll : 스크롤이 되는 뷰와 함께 스크롤이 되어야할 뷰에 반드시 설정. 
- enterAlways
- exitUntilCollapsed
- enterAlwaysCollapsed

```xml-dtd
app:layout_scrollFlags="scroll|exitUntilCollapsed
```



#### collapseMode

- pin

  CollapsingToolbarLayout 이 완전히 축소되면 툴바가 화면위에 고정

  ```xml-dtd
  app:layout_collapseMode="pin"
  ```

- Parallax

  ```xml-dtd
  app:layout_collapseMode="parallax"
  ```

  ​

#### contentScrim

툴바의 색상을 변경할 수도 있고 이미지를 넣을수도 있다.

```xml-dtd
app:contentScrim="#F0C419" 
```

```xml-dtd
app:contentScrim="@drawable/이미지"
```



#### layout_behavior

RecyclerView가 CoordinatorLayout과 함께 동작하기 위해서 반드시 필요. 레이아웃이 RecyclerView의 스크롤 이벤트에 반응할 수 있게 해줌. 이 속성이 지정되어 있지 않다면 아무리 스크롤링해도 이벤트가 발생하지 않음.

```xml-dtd
app:layout_behavior="@string/appbar_scrolling_view_behavior"
```

collapsingLayout 이랑 cardview 들이랑 겹쳐서 보였었는데 behavior속성 지정해주니깐 오류가 해결되었다.





## Glide - 이미지 로딩 라이브러리

### 사용하기

1. Gradle에 추가

   ```
   compile 'com.github.bumptech.glide:glide:3.7.0'
   ```

2. 사용

   ```java
   Glide.with(mContext).load(post.getImage()).into(holder.image);
   ```

   ```
   Glide.with(this).load("http://www.~~~").into(imageView);
   ```

   이런식으로 사용한다.

### 함수

- override()

- placeholder()

- error()

- thumbnail()

- asGif()

  ​




## CardView

#### elevation

음영, 깊이있게 보여주기

```xml-dtd
android:elevation="3dp"
```

#### cardCornerRadius

카드뷰 코너 둥글게 만들기

```xml-dtd
card_view:cardCornerRadius="3dp"
```





## 오류

#### 에러 발생!!

```
Caused by: java.lang.IllegalStateException: This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.
```

```
setSupportActionBar(toolbar);
```

#### 해결

메니페스트에서 

```xml
android:theme="@style/Theme.AppCompat.NoActionBar"
```

해당 액티비티 안에 추가해주면 된다.