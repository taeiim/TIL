# 20170823

## Custom Dialog

### How to

1. xml 파일에 만들고 싶은 대로 다이얼로그 만들기

2. Java 파일에

   ```java
   LayoutInflater dialog = LayoutInflater.from(this);
   final View dialogLayout = dialog.inflate(R.layout.word_list_dialog,null);
   final Dialog dialog = new Dialog(this);

   dialog.setContentView(dialogLayout);
   dialog.show();
   ```

   ​

#### 둥글게 하기 (radius)

1. drawble 에 xml파일 만들기

   ```xml-dtd
   <?xml version="1.0" encoding="utf-8"?>
   <shape xmlns:android="http://schemas.android.com/apk/res/android">
       <solid android:color="#FFFFFF"/>
       <corners
           android:radius="15dp"/>
   </shape>
   ```

2. 다이얼로그 xml에 적용

   ```xml-dtd
   android:background="@drawable/dialog_shape"
   ```

3. Java 파일에 적용

   ```java
   dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
   ```

