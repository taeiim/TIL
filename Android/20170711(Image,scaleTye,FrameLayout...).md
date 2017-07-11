# 20170711(image,scaleType,FrameLayout...)

## image

안드로이드에서 사용할 수 있는 이미지는 jpg, png, gif 등이 사용 가능한데

이미지의 용량도 작고 투명도도 조절할 수 있는 **png**파일을 이용하는 것이 좋다. 



#### 원본이미지가 ImageView보다 작은 경우

고정된 크기의 레이아웃에 이미지뷰를 배치할 때 원본이미지를 다루기 위해서는 **ScaleType** 속성을 잘 사용해야 한다.

```java
<ImageView
	android:scaleType="center"/> 
```

이런식으로 적용해주면 된다.

##### 속성값 종류

- center : 원본 크기 그대로 보여줌, 가운데 정렬
- centerCrop : View 영역에 공백이 있으면 채워서 보여줌, 비율유지, 가운데 정렬
- centerInside : 원본 이미지를 이미지뷰 영역 내에서 정중앙에 표시, 비율유지
- fitStart : View 영역에 맞게 보여줌, 왼쪽 상단 정렬
- fitCenter : View 영역에 맞게 보여줌, 가운데 정렬
- fitEnd : View 영역에 맞게 보여줌, 왼쪽 하단 정렬
- fitXY : View 영역을 가득 채워서 보여줌, 비율유지안함
- matrix : 원본크기 그대로 보여줌 , 왼쪽 상단 정렬





## FrameLayout

자식으로 추가된 여러 뷰(view) 위젯들 중 하나를 레이아웃의 전면에 표시할 때 사용하는 클래스

레이아웃 내의 위젯들은 왼쪽 상단부터 겹쳐서 출력해준다.

- 여러 레이아웃, 위젯을 하나의 레이아웃 (FrameLayout) 안에 겹쳐서 사용할 수 있다.
- 위에서 부터 아래로 코딩되었을 때, 아래 코딩된 레이아웃, 위젯이 위에 보여진다.

#### FrameLayout 속성

- foregroud : 프레임 레이아웃의 전경 이미지를 지정

  ```Java
  android:foreground="@drawble/사진이름"
  ```

- foregroundGravity : 전경 이미지의 위치를 지정

  ```java
  android:foregroudGravity="fill_horizontal"
  ```

  ​



## GridView 속성

- columnCount : 가로(행) 수

- rowCount : 세로(열) 수

- columnSpan : 컬럼 합치기

  ```Java
  android:layout_columnSpan="2"
  ```

  요렇게 써주면 컬럼(행) 2칸이 합쳐진다.

- rowSpan : 로우(열) 합치기






## LinearLayout 뷰 겹침 현상 해결

LinearLayout에서 View들을 추가했을 때 왼쪽 상단으로 다 모여서 겹치는데 이걸 해결하려면 요렇게 한줄만 추가해주면 된다.

```Java
android:orientation="vertical"
```