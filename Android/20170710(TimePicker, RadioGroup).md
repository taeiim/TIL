### DatePicker

안드로이드에서 날짜를 쉽게 입력받기 위해서 DatePicker 위젯을 사용한다.



### TimePicker Spinner형태로 바꾸기

안드로이드에서 TimePicker를 사용해서 사용자에게 시간을 선택할수 있게한다.

기본적으로 Timepicker는 Spinner 형태가 아닌데 Spinner형태로 바꾸려면 xml에서 다음의 옵션만 추가해주면 된다.

```java
android:timePickerMode="spinner"
```



### RadioGroup 가로로 배치 

```Java
android:orientation="horizontal"
```

radioButton 을 radioGroup에 넣어주면 radiobutton에 toRightOf를 써도 라디오버튼이 옆으로 오지 않고 밑으로온다. 그럴때 라디오버튼을 가로로 옆에 놓고 싶을 때 orientation="horizontal" 을 적용해주면 된다.



### Andorid 코드정렬

MAC 에서는 **option + command + L** 로 가능하다.