# About Image

## Matrix

- ##### 이미지 확대, 축소

  ```java
  matrix.postScale(float x, float y);
  ```

  ​

- ##### 이미지 회전

  ```java
  matrix.postRotate(float degrees);  // matrix.postRotate(60); 은 60도 회전 
  ```

  ​

- ##### 이미지 비틀기

  ```java
  matrix.postSkew(float sx, float sy);
  ```

  ​

- ##### 이미지 이동

  ```java
  matrix.postTranslate(float dx, float dy);
  ```

  ​



## Exif

사진의 이미지 정보 (메타데이터)

카메라 정보, 이미지 크기, 화소, 날짜 등의 정보가 들어있다. 



ExifInterface 를 이용해서 정보를 가져올 수 있다. 

```java
ExifInterface exif = null;
try{
    exif = new ExifInterface(imagePath);
}catch (IOException e){
    e.printStackTrace();
}
```





## URI



## Cursor



 