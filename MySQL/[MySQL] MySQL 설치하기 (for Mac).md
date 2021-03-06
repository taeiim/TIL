---
typora-copy-images-to: ../../mysql install pic
---

# MySQL 설치하기 (for Mac) 

## dmg파일 설치

1. https://www.mysql.com 사이트에 접속해서 Downloads>Community>MySQL Community Server 에 들어간다.

## ![스크린샷 2017-04-25 오후 6.51.49](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 6.51.49.png)



2. 밑으로 좀 내리면 이렇게 뜬다.

   그 중 DMG 파일을 다운로드 받는다.

![스크린샷 2017-04-25 오후 6.51.57](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 6.51.57.png)



3. Download 버튼을 눌렀으면 이런 화면이 뜬다.

   그러면 로그인해야할것 같고 회원가입 해야할것 같지만 안해도 된다!!!!!

   맨 밑에 파란색 글씨로 **No thanks, just start my download.** 를 클릭한다.

   ![스크린샷 2017-04-25 오후 6.52.06](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 6.52.06.png)



4. 설치가 시작되고 5분정도 있으면 설치가 완료된다. 

   설치가 된 파일을 실행한다.

![스크린샷 2017-04-25 오후 7.01.20](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.01.20.png)



5. 실행하면 이런화면 이 뜬다. 

   계속 설정하는 것 없이 넘기면 된다.

   하지만 계속 넘기면 안되고 정말 중요한 유의사항이 있다!!!

   ![스크린샷 2017-04-25 오후 7.01.26](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.01.26.png)



​	![스크린샷 2017-04-25 오후 7.01.34](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.01.46.png)

동의를 눌러준다.

![스크린샷 2017-04-25 오후 7.01.54](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.01.54.png)

설치를 누른다.



6. 여기서 정말 중요하다!!!

   OK버튼을 누르고 그냥 넘기면 안되고 패스워드를 기억해야한다. 나는 캡쳐를 해놓았다.

   **root@localhost : —————**

   꼭 캡쳐해놓자!!!!!!

![스크린샷 2017-04-25 오후 7.02.40](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.02.40.png)



7. 드디어 설치가 완료되었다.

![스크린샷 2017-04-25 오후 7.02.56](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.02.56.png)



8. 터미널을 켜서 **mysql.server start**    를 입력해준다.

   ```
   mysql.server start
   ```

   ​

   ![스크린샷 2017-04-25 오후 7.06.41](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.06.41.png)



여기서 끝난게 아니다ㅠㅠ



## 워크벤치 설치

1. https://dev.mysql.com/downloads/workbench/.  에 접속해서 워크벤치를 설치해준다.

   아까처럼 로그인하지 않아도 되고 맨 밑에 있는  **No thanks, just start my download.** 를 클릭해서 설치한다.

![스크린샷 2017-04-25 오후 7.07.33](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.07.33.png)

2. 설치하는 것은 쉬워서 생략한다. 

   설치가 완료 되면 응용프로그램에 들어가면 워크벤치가 있다. 클릭해서 실행한다.

   ![스크린샷 2017-04-25 오후 7.13.13](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.13.13.png)

   ​

3. 고래 (워크벤치) 아이콘을 눌러서 Applications 폴더에 드래그 해준다.

   그러면 복사가 된다.

   ![스크린샷 2017-04-25 오후 7.11.42](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.11.42.png)

![스크린샷 2017-04-25 오후 7.12.09](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.12.09.png)



4. 워크벤치 설치 끝!!

   ![스크린샷 2017-04-25 오후 7.13.26](/Users/parktaeim/Desktop/스크린샷 2017-04-25 오후 7.13.26.png)



## MySQL 설정하기

**터미널**을 열고서 하면된다!

### 1. MySQL패치 설정하기

MySQL을 아무곳에서나 실행되게 설정하기 위함이다.



아래 명령어를 입력해준다.

```
vi ~/.profile
```

그다음 

export PATH=/opt/local/bin:/opt/local/sbin:/usr/local/mysql/bin:$PAT

이걸 복사해서 붙혀준다.

붙히고 esc 를 누르고 :wq를 입력하고 끝내면된다.



### 2. 비밀번호 설정

1. 비밀번호 변경하기

```
SET PASSWORD = PASSWORD('설정할 비밀번호');
```

2. 비밀번호 적용

```
flush privileges;
```



맥에 MySQL 설치하기 끝!!