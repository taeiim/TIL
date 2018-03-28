# [MongoDB] Collection, Document

## Collection

- #### Collection 생성

  Collection은 RDBMS에서의 table이다.

  Collection을 생성할 때는 **db.createCollection(name,[options])** 명령어를 사용한다.

  ```
  > db.createCollection("students");
  { "ok" : 1 }
  > show collections;
  students
  ```

  ​

