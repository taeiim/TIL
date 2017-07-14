# 20170714(Inflater, CompoundButton,visible)

## Inflater(인플래이터)

Inflater는 '부풀리는 장치' 또는 '자전거 등의 공기 펌프' 라는 뜻이 있다.

즉, 풍선에 바람을 넣어서 실제 객체로 만들어 사용한다는 의미이다.(풍선은 바람을 넣기 전에는 별 의미가 없다.). 

안드로이드에서의 inflater를 이와같이 생각하면, 정적으로 존재하는 XML파일(풍선)을 JAVA코드에서 접근하여(바람을 넣어서) 실제 객체로 만들어서 사용하는 것이라고 볼 수 있다.

**메뉴 인플래이터** 개체는 메뉴 XML파일을 자바 코드에서 가져와 사용하는 것이고, **레이아웃 인플래이터**는 레이아웃 XML파일을 자바 코드에서 가져와 사용하는 것이다.





## 컴파운드 버튼

CompoundButton 클래스는 Button 클래스의 하위 클래스로, 체크박스, 라디오버튼, 스위치, 토글버튼의 상위 클래스이다. 

#### 체크박스(CheckBox)

체크박스는 여러 개의 체크 박스가 있어도 서로 독립적으로 동작해서 여러개를 동시에 체크할 수 있다. 

- 강제로 체크를 껴거나 끌때 **setChecked()**

  ```xml
  androd:setChecked="true"
  ```

- 체크가 되었는지 확인하는 **isChecked()**

  ```xml
  android:isChecked="true"
  ```



#### 스위치 (Switch), 토글버튼 (ToggleButton)

스위치와 토글버튼은 모양만 조금 다를 뿐 용도는 거의 비슷하다. 



#### 라디오버튼, 라디오그룹

라디오버튼 중 한개만 선택가능하게 하려면 라디오그룹 안에 라디오버튼을 넣어줘야 한다.

```xml
<RadioGroup
  andriod:id="@+id/rGroup">
  <RadioButton
               android:text="남자"/>
  <RadioButton
               android:text="여자"/>
</RadioGroup>
```

이렇게 하면 둘중에 한개만 선택할 수 있다.





## 기타

#### EditText에 입력된 값을 가져오기 

주로 버튼 클릭 이벤트 리스너 안에 넣어서 사용한다.

```java
EditText editText;
editText = (EditText) findViewById(R.id.edittext1);
String str = editText.getText().toString();
```



#### visible

위젯이 보이지 않도록 설정하거나 보이게 설정 할 수 있다.

- xml코드

  ```xml
  <TextView
            android:text="가나다"
            android:visibility="invisible"/>
  ```

- java코드

  ```java
  text1.setVisibility(android.view.View.VISIBLE);
  text2.setVisibility(android.view.View.INVISIBLE);
  ```

