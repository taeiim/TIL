# Youtube API

## Downloads

#### YouTube Android Player API

https://developers.google.com/youtube/android/player/downloads/

여기에 들어가서 다운로드 받은 후 압축을 풀고 

1. 프로젝트의 libs 에 넣어준다.
2. AndroidStudio > app > Open Module Settings > Dependencies > + > 2 jar dependency > libs 에 있는 YouTubeAndroidPlayerApi.jar 클릭 > OK





## 사용하기

##### 1. 메니페스트에 추가

```
<uses-permission android:name="android.permission.INTERNET"/>
```



##### 2. xml

```xml-dtd
<fragment
        android:id="@+id/youtubeplayerfragment"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true"/>
```



##### 3. JAVA 코드

#### Method

- **onInitializationFailure**

  플레이어가 초기화되지 못할 때 호출

- **onInitializationSuccess**

  플레이어가 초기화될 때 호출

  ​



#### Developer key



#### Video ID

https://www.youtube.com/watch?v=WyiIGEHQP8o

이런 주소가 있으면 뒤에 **WyilGEHQP8o** 가 Video ID