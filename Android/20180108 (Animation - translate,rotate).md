# 20180108 

## Animation

**duration** : 효과시간 1/1000초 단위 (2초 == 2000)

**repeatCount** : 반복 횟수



### rotate (회전 애니메이션)

2초동안 360도 한바퀴 회전

```Xml
<rotate
        android:duration="2000"
        android:fromDegrees="0"
        android:toDegrees="360"
        android:pivotX="50%"
        android:pivotY="50%"
        />
```



무한으로 계속 회전하고 싶으면??

```xml
android:repeatCount="infinite"
android:repeatMode="restart"
```

요 두줄을 추가해주면 된다!!



### translate ( 위치이동 애니메이션 )

**fromXDelta** : X의 시작위치  /  **fromYDelta** : Y의 시작위치

**toXDelta** : X의 종료위치  /  **toYDelta** : Y의 종료위치



- 위에서 아래로 이동

  ```Xml
  <set xmlns:android="http://schemas.android.com/apk/res/android">
  	<translate android:duration="800"
     		 android:fromYDelta="-100%p"
     		 android:toYDelta="0%p"/>
  </set>
  ```



- 아래에서 위로 이동 (set 생략)

  ```xml
  <translate android:duration="800"
     		 android:fromYDelta="-100%p"
     		 android:toYDelta="0%p"/>
  ```

  ​