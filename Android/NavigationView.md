# NavigationView

Navigation View 는 어플리케이션 디자인 패턴중 하나인 DrawerLayout 안에 있다.

### 사용하기

1. 안드로이드 프로젝트를 생성할 때 Empty Activity로 생성하지 말고 Navigation Drawer Activity 로 생성해준다.
2. 그러면 자동으로 코드가 엄청 생겨있다. 



## 코드에 있는 키워드 정리

프로젝트를 생성하면 기본으로 onCreate 안에 있는 코드이다.

```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
```



- ### Toolbar

  액션바 대신 툴바를 사용한다. (액션바는 deprecated 됨) 그이유는

  1. 툴바는 View이기 때문에 상하좌우 어디든지 붙일 수 있다.
  2. View이기 때문에 애니메이션 적용이 쉽다.
  3. 스크롤에 따라 위치가 변경되도록 하는 등 무궁무진한 응용이 가능하다.

  #### 사용하기

  1. build.gradle의 dependencies에 design 추가

  ```java
  dependencies {
  	compile 'com.android.support:appcompat-v7:23.2.1'
  	compile 'com.android.support:design:23.2.1'
  }
  ```

  2. NoActionBar스타일로 변경

     actionbar 대신에 toolbar를 쓰는 것이어서 액션바가 없는 테마로 변경

     values 폴더에 styles.xml에 해당 테마를 만들어준다.

  ```xml
  <style name="AppTheme.NoActionBar">
      <item name="windowActionBar">false</item>
      <item name="windowNoTitle">true</item>
  </style>
  ```

  3. layout작성하기

  ```xml
  <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
      ~~~~~~~~~
      android:theme="@style/AppTheme.NoActionBar">
      <android.support.v7.widget.Toolbar
          xmlns:app="http://schemas.android.com/apk/res-auto"
          app:titleTextColor="#fff"
          android:id="@+id/toolbar"
          android:background="@color/colorPrimary"
          android:layout_width="match_parent"
          android:layout_height="?attr/actionBarSize">  
      </android.support.v7.widget.Toolbar>
  </LinearLayout>

  ```

  4. onCreate 작성

     setSupportActionBar() 함수를 사용하요 Toolbar를 적용해준다.

  ```java
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main_activity);
    
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
      toolbar.setTitleTextColor(Color.WHITE);
  }
  ```

  ​

- ### FloatingActionButton

  플로팅 액션 버튼은 어플리케이션에서의 주 액션을 나타낸다. 

  갤러리에서의 주 액션은 이미지를 터치하는 것이기 때문에 아무런 버튼이 필요하지 않지만, 파일 추가가 주 액션인 어플리케이션에서는 플로팅 액션 버튼을 사용하는 것이 좋다.

  두가지 크기가 있다.

  - 기본 크기 : 대부분 이 크기
  - 소형 크기 : 오직 다른 화면 요소와 시각적 연속성을 생성하는 경우에만 사용



​	플로팅 액션 버튼은 생성, 즐겨찾기, 공유, 찾기, 탐색과 같은 긍정적인 액션으로 만들어야 한다.

​	보관 또는 휴지통, 불특정한 액션, 경보 또는 에러, 텍스트 자르기와 같은 제한된 작업, 볼륨 조절 또는 폰트 색 변경과 같은 툴바에서 해야하는 컨트롤과 같은 중요치 않거나 파괴적인 액션을 위한 프로팅 액션 버튼은 피하는 것이 좋다.

​	

​	좋은 사이트 : http://davidlab.net/google-design-ko/components/buttons-floating-action-button.html#



- ### DrawerLayout


  일명 햄버거 메뉴ㅋㅋㅋ

  전체적으로 큰 틀은 DrawerLayout으로 설정된다. 즉, xml에서 가장 최상단의 루트가 된다는 의미이다.

- ​



## Navigation Drawer Layout 조작

### ActionBar를 가리지 않고 Content만 가리는 방법

기본으로 생성된 layout 계층은

```
DrawerLayout
--CoordinatorLayout
----AppBarLayout
-------ToolBar
----content
--NavigationView
```

이렇게 NavigationView가 화면을 전체적으로 덮어버린다.



ActionBar를 가리지 않고 Content만 가리게 하려면??

1. xml구조를 다음과 같이 수정해보자

   ```
   CoordinatorLayout
   --AppBarLayout
   ----Toolbar
   --DrawerLayout
   ----Content
   ----NavigationView
   ```


2. DrawerLayout과 NavigationView 에서 android:fitsSystemWindows="true"

   ```java
   android:fitsSystemWindows="true"
   ```

   를 제거한다.

   **fitsSystemWindows **속성은 뷰가 차지할 수 있는 영역을 **상태바 및 소프트키 영역을 제외한 영역까지 확장**해주는 역할

   ​

3. DrawerLayout에 

   ```java
   android:layout_marginTop="?attr/actionBarSize"
   ```

   를 추가해준다.



