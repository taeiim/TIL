# Google API 사용하기

## Google 에서 제공하는 API 키 얻기

1. Google Developers Console 사이트에서 프로젝트 만들기를 해서 만든다.

2. 사용할 API 클릭

3. 우측 상단에 사용설정 클릭

4. 사용자 인증 정보 만들기를 클릭

5. API키를 클릭해서 API 키를 만든다. Android 앱 클릭

6. 패키지 이름 및 지문 추가 클릭

   이때 안드로이드 프로젝트의 패키지 이름과 Android Studio가 설치된 컴퓨터에서 생성된 **SHA-1 인증서 지문**이 필요하다.

   #### SHA-1인증서 지문 얻는 방법(Mac에서)

   터미널에 들어가서

   ```=
   keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
   ```

   이 명령을 복붙해주면 SHA1: 어쩌구저쩌구 라고 나온다

   ​



## Android 프로젝트에 적용하기

1. manifests 에 등록받은 API키를 입력

   application 태그 하위요소로 meta-data 태그를 사용하여 등록받은 API키를 입력

```java
<application
        ~~~~~~~~~~~~~~어쩌구저쩌구~~~~~~~~~~~~
  
        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="등록받은 API키" />
        
        <activity android:name=".MainActivity">
        
</application>
```



2. build.gradle(Module:app) 에 들어가서 필요한 라이브러리를 추가해준다. 


```Java
dependencies {
    ...........................................................
    compile 'com.google.android.gms:play-services-maps:10.2.1'
    compile 'com.google.android.gms:play-services-location:10.2.1'
}
```





