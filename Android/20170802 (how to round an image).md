# 20170802

## 이미지 동그랗게 라운딩하기

```java
imageView.setBackground(new ShapeDrawble(new OvalShape()));
imageView.setClipToOutline(ture);
```

근데 setBackground는 minSdkVersion 이 16이상이여야 하고

setClipToOutline은 21이상이어서 minSdk를 21로 고쳐줘야 빨간줄이 없어졌다.



## CircleImageView 사용해서 동그랗게 만들기

### 오픈소스 사용

1. gradle에 추가

   ```
   dependencies{
     compile 'de.hdodenhof:circleimageview:2.1.0'
   }
   ```

   ​

2. xml 안에 사용하기

   ```Xml
   <de.hdodenhof.circleimageview.CircleImageView
       xmlns:app="http://schemas.android.com/apk/res-auto"
       android:id="@+id/profile_image"
       android:layout_width="50dp"
       android:layout_height="50dp"
       android:src="@drawable/profile"
       app:civ_border_width="2dp"
       app:civ_border_color="#FF000000"/>
   ```

