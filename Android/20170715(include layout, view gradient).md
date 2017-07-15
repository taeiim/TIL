# 20170715

## include layout

레이아웃을 작성할 때 Title이나 Bottom에 똑같은 기능을 가지는 레이아웃을 여러개의 액티비에서 사용하는 경우에 'include'라는 속성을 이용하면 하나의 레이아웃을 작성한 후 그 레이아웃을 모든 액티비티에 적용시킬 수 있다.

```xml
<include layout="@layout/include할 레이아웃 이름" />
```



## 배경 그라데이션

1. Drawble에 xml파일을 새로 만들어서 그라데이션을 정의

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape  xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:angle="90"
        android:type="linear"
        android:startColor="#ce93db"
        android:centerColor="#e1bee7"
        android:endColor="#fce4ec"/>
</shape >
```

startColor가 화면 맨 끝

endColor가 화면 맨 위에 적용



2-1. Activity에서 배경화면을 설정

```java
view.setBackgroundResource(R.drawable.xml파일명);
```



2-2. xml파일에서 설정

```xml
<LinearLayout
        android:background="@drawable/xml파일명">
</LinearLayout>
```



