# Material design

## Material design의 세부 스타일 요소 

1. #### 플로팅 액션 버튼 (FAB)

   동그란 형태의 플로팅 액션 버튼을 사용해 주요 액션을 나타낼 수 있다.

   플로팅 액션 버튼은 그림자를 갖는 별개의 표현이며, 배경색으로는 밝은 계통의 강조 색을 사용하는 것이 일반적이다. 다른 표면들보다 보통 8dp 상승되어 있다. 주로 스크린 오른쪽이나 두 표면이 만나는 가장자리 가운데에 위치시키는 것이 일반 적이다.

2. #### 내비게이션 드로어(Navigation drawer)

   드로어의 표준 너비는 스마트폰에서는 320dp를 넘기지 않는다. 최소 너비는 스크린 너비에서 표준 툴바의 높이를 뺀 값보다 더 적지 않은 것이 좋습니다.(넥서스 5에서 360dp - 56dp = 304dp)

   드로어에 있는 아이템의 높이는 기본 그리드 라인을 따른다. 각 열은 48dp 높이를 갖으며, 리스트 섹션 위는 8dp의 여백을, 각 열을 구분하는 구분선 위 아래에도 8dp 여백을 남겨둔다.

3. #### 히어로 전환 애니메이션

   어떤 아이템을 클릭하여 상세 화면으로 전환되는 경우, 선택된 아이템이 목록 화면에서 상세 화면으로 자연스럽게 전환되는 'Hero 전환' 을 적용한다.





## Material design 사용하기

#### 1. 라이브러리 추가

build.gradle(Module:app) 에 들어가서 Support Library를 추가해야 한다. dependencies에 추가해준다.

```
compile 'com.android.support:appcompat-v7:21.0.3'
```



#### 2. 타겟 변경

material design을 적용하기 위해서는 타겟 버전을 21까지는 해줘야 한다.



#### 3. 테마 적용

styles.xml 에 적용해준다.

```Xml
<resources>
	<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    </style>
</resources>
```



#### 근데 이 모든게 안드로이드 스튜디오에서 프로젝트를 생성할 때 기본적으로 적용되어 있다!!!!!

직접 안해줘도 됨ㅠ.ㅠ 



#### Manifest.xml

```xml
<application
    ~~~~~블라블라~~~~어쩌구~~~저쩌구~~~~
	android:theme="@style/AppTheme">
 </application>
```

Manifest에도 자동으로 적용되어 있다.





## Material Theme

#### 주 색상

- colorPrimary : 어플리케이션의 주 색상
- colorPrimaryDark : colorPrimary 보다 조금 더 어두운 색상, 상태바 색상을 별도로 지정하지 않으면 상태바 색상으로 사용

#### 기타 설정 가능한 색상

- colorAccent : 강조 색상(보통 주 색상과 대비되는 색깔로 지정)
- colorControlNormal : 비활성 상태나 선택한 상태 등이 아닌 일반적인 상태에 적용
- colorControlHighlight : 컨트롤러를 터치하거나 선택했을 때 표시할 색상
- android:navigationBarColor : 맨 밑에 네비게이션 바 색상 설정

##### 주 색상을 설정하면 나머지 색상은 주 색상에 맞춰 자동 지정됨





## Widgets

### - NavigationView

Navigation View 는 어플리케이션 디자인 패턴중 하나인 DrawerLayout 안에 있다.

#### 사용하기

1. 안드로이드 프로젝트를 생성할 때 Empty Activity로 생성하지 말고 Navigation Drawer Activity 로 생성해준다.
2. 그러면 자동으로 코드가 엄청 생겨있다. 



NavigationView에 대한 것은 따로 정리하겠Da!!!



### - TextInputLayout

EditText의 업그레이드!! 움직이는 EditText를 만들 수 있다!! 완전 좋음!!!!

EditText 선택 전에는 hint가 있고 선택하면 hint가 EditText위로 이동한다.

Hint text, Error text 표시 지원

#### 사용하기

Dependencies 에 disign을 추가한다.

```xml
dependencies {
    compile 'com.android.support:design:22.2.0'
}
```

TextInputLayout 당 하나의 EditText를 포함

```xml
<android.support.design.widget.TextInputLayout
	~~~~블라블라
    >                                         
    <android.support.design.sidget.TextInputEditText
    	android:hint="ID"              
        ~~~~~~/>
</android.support.design.widget.TextInputLayout>                                                    
```

#### EditText 글씨수 표시

- ##### setCounterEnabled

EditText안의 글씨 수 표시해줌

```java
text1.setCounterEnabled(true);
```

이렇게 하면 EditText밑에 글씨수가 표시되는데 7/100(현재글씨수/최대글씨수) 처럼 표시되게 하고싶다면

- ##### setCounterMaxLength

를 사용해주면 된다.

```java
text1.setCounterMaxLength(100);
```



#### 에러메세지

예를 들어 EditText에 아무것도 입력하지 않았다고 에러메세지를 보여주고 싶을때 사용한다.

- ##### setErrorEnabled

  에러메세지를 사용할지 안할지

  ```java
  text1.setErrorEnabled(true); //에러메세지 사용
  text1.setErrorEnabled(false); //사용안함
  ```

- ##### setError

  출력할 에러메세지

  ```java
  text1.setError("ID를 입력해주세요");
  ```





### - CoordinatorLayout



### - CardView

