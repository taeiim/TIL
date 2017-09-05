# 20170905

## 어플 아이콘 바꾸기

Manifests 의 application에 icon을 바꾸어주면 된다. label은 아이콘 밑에 표시되는 어플명이다. 

```
 <application
        android:icon="@drawable/application_icon"
        android:label="@string/app_name">
</application>
```



## 이중 탭

#### fragment가 tab안에 있어서 내용이 tab에 가려지는 오류

AppBarLayout과 TabLayout을 감싸고 있던 CoordinatorLayout을 LinearLayout으로 바꾸어주니 해결되었다.



#### 상단에 있는 탭이 클릭 되면 하단에 있는 탭이 클릭되지 않는 오류

ViewPager에 아래 속성을 넣어주면

```xml-dtd
android:layout_marginBottom="?attr/actionBarSize"
```

프래그먼트가 하단 네비게이션바가 있는 자리를 비우고 생겨서 오류가 해결되었다.