

# 20170906

## Realm 오류

#### io.realm.exceptions.RealmException: 'WordBook' has a primary key, use 'createObject(Class<E>, Object)' instead.

**오류코드**

```java
realm.beginTransaction();
WordBook wordBook = realm.createObject(WordBook.class);
wordBook.setList_id(System.currentTimeMillis());
wordBook.setTitle(title);
wordBook.setDesc(describe);
realm.commitTransaction();
```

**해결코드**

```java
realm.beginTransaction();
WordBook wordBook = realm.createObject(WordBook.class,System.currentTimeMillis());
wordBook.setTitle(title);
wordBook.setDesc(describe);
realm.commitTransaction();
```

PrimaryKey (기본키) 는 객체를 만든 후에 수정할 수 없다.  



