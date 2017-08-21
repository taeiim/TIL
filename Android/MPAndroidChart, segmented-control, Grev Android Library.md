# DjangoGirlsHackathon때 사용한 라이브러리

## MPAndroidChart

차트(통계) 라이브러리 

### 사용하기

1. gradle에 추가

   ```
   allprojects {
       repositories {
           jcenter()
           maven { url "https://jitpack.io" }
       }
   }
   ```

   ​

2. gradle:app dependencies에 추가

   ```
   compile 'com.github.PhilJay:MPAndroidChart:v3.0.2'
   ```

   ​

3. xml 추가

   - 꺾은선 그래프

     ```xml-dtd
     <com.github.mikephil.charting.charts.LineChart
                 android:id="@+id/chart_Line"
                 android:layout_width="match_parent"
                 android:layout_height="350dp">
     </com.github.mikephil.charting.charts.LineChart>
     ```


   - 막대 그래프

     ```xml-dtd
     <com.github.mikephil.charting.charts.BarChart
                 android:id="@+id/chart_Bar"
                 android:layout_width="match_parent"
                 android:layout_height="350dp">
     </com.github.mikephil.charting.charts.BarChart>
     ```



### 속성

- ##### 그래프 애니메이션 넣기

  1000은 속도.   숫자가 클수록 그래프 움직이는 속도가 느려짐

  ```Java
  lineChart.animateY(1000);
  ```

- ##### x축 라벨들 하단으로

  ```Java
  XAxis xAxis = lineChart.getXAxis();
  xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
  ```

- ##### 그래프 색깔 넣기

  ```java
  dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
  ```

- ##### x축 라벨 안나올때 

  ```java
  lineChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(labels));
  ```





## segmented-control library

https://github.com/Kaopiz/android-segmented-control

### 사용하기

1. gradle decencies에 추가

   ```
   dependencies {
       compile 'info.hoang8f:android-segmented:1.0.6'
   }
   ```

   ​

2. xml 

   ```xml-dtd
   <info.hoang8f.android.segmented.SegmentedGroup xmlns:segmentedgroup="http://schemas.android.com/apk/res-auto"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_margin="10dp"
           android:gravity="center"
           android:orientation="horizontal"
           segmentedgroup:sc_border_width="2dp"
           segmentedgroup:sc_corner_radius="5dp"
           segmentedgroup:sc_tint_color="#E0775F">

           <RadioButton
               android:id="@+id/buttonWeek"
               style="@style/RadioButton"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="1주일" />

           <RadioButton
               android:id="@+id/button1Month"
               style="@style/RadioButton"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="1개월" />

           <RadioButton
               android:id="@+id/button3Month"
               style="@style/RadioButton"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="3개월" />

           <RadioButton
               android:id="@+id/button6Month"
               style="@style/RadioButton"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="6개월" />

       </info.hoang8f.android.segmented.SegmentedGroup>
   ```





## Grev

점들을 베이스로 에니메이션을 만드는 안드로이드 용 라이브러리

https://github.com/glomadrian/Grav