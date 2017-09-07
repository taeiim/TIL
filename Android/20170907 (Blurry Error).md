# 20170907

### TextView 클릭

```xml-dtd
android:clickable="true"
```

xml에 clickable을 추가해주지 않으면 onClickListenr를 만들 수 없다. 



## Error

#### Blurry 라이브러리 — 앱 실행시 blur처리 안되는 오류

분명히 onCreate 안에 blur처리가 되는 코드를 넣어줬는데 앱 실행을 해보면 블러 처리가 안되어있다면?

**오류코드**

```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Blurry.with(MainActivity.this)
                .radius(25)
                .sampling(2)
                .async()
                .animate(500)
                .onto((ViewGroup) findViewById(R.id.content));
    }
```



**해결코드**

```java
final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content);
        relativeLayout.post(new Runnable() {
            @Override
            public void run() {
                Blurry.with(MainActivity.this)
                        .radius(25)
                        .sampling(2)
                        .async()
                        .animate(500)
                        .onto((ViewGroup) findViewById(R.id.content));
            }
        });
```

