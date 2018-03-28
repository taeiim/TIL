# [MongoDB] CRUD

#### CRUD란?

**C**reate , **R**ead, **U**pdate, **D**elete 의 약자로 데이터베이스의 자료를 생성, 조회, 수정, 삭제하는 기능이다.



## 데이터 삽입 - insert()

###### CRUD의 Create에 해당한다. 

```
> db.students.insert({stuNo:1,name:'taeiim',age:18})
WriteResult({ "nInserted" : 1 })
```





## find()

###### CRUD의 R, Read에 해당한다.

입력된 데이터를 조회

- ##### 전체 컬렉션 조회 : find()

  **db.collection명.find()** 를 이용한다. 

  ```
  > db.students.find()
  { "_id" : ObjectId("5a1d3e855d572ac782917484"), "stuNo" : 1, "name" : "taeiim", "age" : 18 }
  ```

- ##### document (row) 조회 : findOne()

  ```
  > db.students.findOne({"name":"taeiim"})
  {
  	"_id" : ObjectId("5a1d3e855d572ac782917484"),
  	"stuNo" : 1,
  	"name" : "taeiim",
  	"age" : 18
  }
  ```





## update()

###### CRUD의 U, Update에 해당한다.

- ##### 특정 field 업데이트

  **$set**을 사용해서 변경한다.

  ```
  > db.students.update({"stuNo":1}, {$set:{age:19}})
  WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
  ```





## remove()

###### CRUD중 D, Delete에 해당한다.

- ##### 컬렉션 전체 삭제

  ```
  > db.students.remove({})
  ```

  ​

- ##### 컬렉션 중에서 조건에 맞는 내용 일부 삭제

  ```
  > db.students.remove({"stuNo":1})
  ```

  ​