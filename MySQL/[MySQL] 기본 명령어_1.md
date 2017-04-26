# [MySQL] 기본 명령어_1

## MySQL 접속/상태 확인

#### MySQL 접속

```mysql
mysql -u사용자아이디 -p비밀번호
```



#### 접속 끊기

```mysql
mysql> exit
```



#### 현재 상태 보기

```mysql
mysql> status
```





## 데이터베이스 생성

데이터베이스 생성은 **create database 데이터베이스이름**을 통해 한다.

```mysql
create database userdb
```

데이터베이스를 사용하기 위해

```mysql
use userdb
```





## DB관리

#### DB 목록 보기

```mysql
mysql> SHOW DATABASES;
```



#### DB 고르기

```mysql
mysql> USE DB이름;
```



#### DB생성

```mysql
mysql> CREATE DATABASE DB이름;
```



#### DB 지우기

```Mysql
mysql> DROP DATABASE DB이름;
```





## 테이블 관리

#### 테이블 목록 보기

```mysql
mysql> SHOW TABLES;
```



#### 테이블 구조 보기

```mysql
mysql> DESC 테이블명;
mysql> DESCRIBE 테이블명;
mysql> EXPLAIN 테이블명;
```



#### 테이블 만들기

```
CREATE TABLES 테이블명 (항목이름1 변수형, 항목이름2 변수형, ...);

mysql> CREATE TABLE customer
>(Name char(50),
>Address char(50),
>City char(50),
>Country char(25),
>Birthday date);
```



#### 테이블 이름 바꾸기

```mysql
mysql> RENAME TABLE 기존테이블이름 to 바꿀테이블이름;
```



#### 테이블 지우기

```mysql
mysql> DROP TABLE 테이블명;
```

