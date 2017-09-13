# Gson

**Gson**은 Json을 자바객체로 또는 자바객체를 Json으로 변환해주는 라이브러리이다.

JAVA <-> JSON 변환



### 사용하기

1. Gson 객체 생성

   ```java
   private static final Gson gson = new Gson();
   ```



2. 형변환

   - **Java -> Json**

     ```java
     gson.toJson(person);  //short,int
     ```

   - **Json -> Java**

     ```java
     gson.fromJson(txt.getText().toString(), Person.class);
     ```

     ​

3. 제네릭 변환

 