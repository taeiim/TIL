# [JSP] 자바빈 사용법 

## 자바빈 만들기

데이터 객체에는 데이터가 있어 그에 해당하는 getter와 setter가 있다.

빈을 만든다는 것은 데이터 객체를 만들기 위한 클래스를 만드는 것이다.



## 자바빈 액션태그

자바빈을 JSP 페이지에서 사용할 때 3가지 액션 태그를 제공한다.

### useBean

**자바빈 객체를 생성할 때 사용한다**

```Jsp
<jsp:useBean id="자바빈 이름" class="자바빈 클래스 이름" scope="범위" />
``` 

자바빈 클래스를 기술할 때에는 패키지 명을 포함한 자바 클래스를 쓴다.

```jsp
<jsp:useBean id="javaBeanEx" class="com.bean.exBean" scope="page" />
```

**Scope** 속성은 자바빈 객체의 유효 범위로 객체가 공유되는 범위를 지정한다.

아래 4개 중 하나이며 기본값은 page이다.

- page : 생성된 페이지 내에서만 사용 가능

- request : 요청된 페이지 내에서만 사용 가능

- session : 웹브라우저의 생명주기와 동일하게 사용 가능

- application : 웹 어플리케이션 생명주기와 동일하게 사용 가능

  ​

### setProperty

**생성된 자바빈 객체에 프로퍼티 값을 저장한다**

```jsp
<jsp:setProperty name="student" property="name" value="taeiim"/>
```



### getProperty

**생성된 자바빈 객체에서 저장된 프로퍼티 값을 가져온다**

```jsp
<jsp:getProperty name="student" property="name"/>
```

name 속성은 자바빈 객체의 이름을 명시한다. (필수)

property 속성은 프로퍼티 명을 기술한다. (필수)



---

**자바빈 프로퍼티** 란??

-프로퍼티는 자바빈에 저장되어 있는 값을 나타낸다.

-메소드 이름을사용해서 프로퍼티의 이름을 결정한다.

\- 값을 설정하는 메서드는 프로퍼티 이름의 첫 글자를 대문자로 변환한 문자열 앞에 set을 붙인다. Ex) setId, setTitle

\- 값을 읽어오는 메서드는 프로퍼티 이름의 첫 글자를 대문자로 변환한 문자열 앞에 get을 붙인다  Ex) getId, getTitle

