# 20170716 

## SharedPreferences

간단한 정보들을 저장하기 위한 클래스. 파일 시스템 기반으로서 XML형태로 저장되며, DB를 사용하기에 부담스러운 것들을 저장하는데 유용하다.

Map구조인 key-value 형태로 데이터를 저장한다. 저장된 데이터는 어플리케이션이 삭제되기 전까지 내부에 파일형태로 보관된다.

### 사용하기

1. SharedPreferences 정의

   ```Java
   SharedPreferences pref = getSharedPreferences("Preference 이름",Activity.MODE_PRIVATE);
   ```

   ```java
   SharedPreferences pref = getSharedPreferences("Preference 이름",0);
   ```

   MODE_PRIVATE로 쓰나 0으로 쓰나 똑같음

   - MODE_PRIVATE : 자기 앱에서만 사용하도록 설정, 기본값, 0
   - MODE_WORLD_READABLE : 다른 앱에서 읽기가능
   - MODE_WORLD_WRITEABLE : 다른 앱에서 쓰기가능

   일반적으로는 자신의 앱에서만 사용한다.

   ​

2. 설정 값 저장하기

   ```Java
   SharedPreferences pref = getSharedPreferences("Preference 이름",Activity.MODE_PRIVATE);
   SharedPreferences.Editor ed = pref.edit();
   ed.putString(key,value);
   ed.commit(); //반드시 해야지 기록된다.
   ```

   저장, 기록을 위해서 Editor 객체 생성

   ​

   ```java
   ed.putBoolean(arg0, arg1);
   ed.putFloat(key, value);
   ed.putInt(key, value);
   ed.putLong(key, value);
   ed.putString(key, value);
   ```

   5가지 형을 기록할 수 있다.

   ​

3. 설정값 불러오기

   ```java
   SharedPreferences pref = getSharedPreferences((String)Preferences 이름, MODE_PRIVATE);
   pref.getString(key,default_value);
   ```

   ```java
   getBoolean(key, defValue);
   getFloat(key, defValue);
   getInt(key, defValue);
   getLong(key, defValue);
   getString(key, defValue);
   ```

   자료 타입마다 다른 명령

   defvalue는 저장된 값이 없을 경우 반환하는 값

   ​

4. 지우기

   ```java
   ed.clear(); //전체 지우기
   ed.remove(key); //부분 지우기
   ```

   ​

   ​