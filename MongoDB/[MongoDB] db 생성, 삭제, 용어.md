# [MongoDB] db 생성, 삭제, 용어

## 준비하기

- ##### 데이터베이스 생성

  use를 사용해서 데이터베이스를 생성한다. 

  ```
  > use mongodb_study
  ```

  ​

- ##### 현재 데이터베이스 확인

  ```
  > db
  ```

  ​


- ##### 데이터베이스 리스트 확인

  내가 만든 모든 데이터베이스들을 확인한다.

  ```
  > show dbs
  ```

  but!! 최소 한개의 document가 있어야 확인된다.

  ​

- ##### 데이터베이스 삭제

  **db.dropDatabase()** 명령어를 사용해서 데이터베이스를 제거한다.

  삭제하기 전에 **use DATABASE_NAME**으로 삭제하려는 데이터베이스를 선택해줘야 한다.

  ```
  > use study_mongodb
  switched to db study_mongodb
  > db.dropDatabase();
  { "ok" : 1 }
  ```





## RDBMS  vs.  MongoDB

##### RDBMS란?

Relational DataBase Management System - 관계형 데이터베이스

- #### 용어 비교

|      RDBMS       |      MongoDB       |
| :--------------: | :----------------: |
|      table       |     collection     |
|    tuple/row     |      document      |
|      column      |       field        |
| Primary key (pk) |     object id      |
|    table join    | Embedded Documents |

