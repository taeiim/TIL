# [JSP] 세션

## 세션이란?

세션도 쿠키와 마찬가지로 서버와의 관계를 유지하기 위한 수단이다.

하지만 쿠키와는 달리 클라이언트의 특정 위치에 저장되는 것이 아니라, **서버상에 객체로 존재**한다.

세션은 JSP(서버) 에만 접근이 가능하므로 보안유지에 강력하다.

저장할수 있는 데이터에는 한계가 없다.

세션은 웹 브라우저 당 하나씩만 발급된다.



---
 
## 세션 관련 메소드

- setAttribute() : 세션에 데이터 저장
- getAtrribute() : 세션에서 데이터를 얻는다.
- getAttributeNames() : 세션에 저장되어 있는 모든 데이터의 이름을 얻는다. 
- getId() : 자동 생성된 세션의 아이디를 얻는다.
- isNew() : 세션이 최초 생성되었는지, 이전에 생성된 세션인지를 구분한다.
- getMaxInactiveInterval() : 세션의 유효시간을 얻는다. 
- removeAttribute() : 세션에서 특정 데이터를 제거
- invalidate() : 세션의 모든 데이터를 삭제



---

## 세션 사용하기

#### 세션에 값 저장하기

```jsp
session.setAttribute(String name, Object value);
```

name은 String 형으로 들어가고 value는 **Object** 형이여야만 한다.

동일한 이름으로 세션에 저장하면, 항상 덮어씌운다.

ex.

```jsp
session.setAttribute("id","taeiim");
```





#### 세션에 저장된 값 얻어오기

```jsp
Object getAttribute(String name);
String id = (String) session.getAttribute("id");
```

**getAttribute** 메소드를 사용

리턴 타입이 java.lang.object 이므로 데이터 본래의 타입으로 **캐스트** 연산을 해야한다.

getAttribe 메소드는 결과값을 Object형으로 되돌리기 때문에 세션에 저장된 값을 String형태로 얻어오려면 cast 연산자로 형 변환을 해야한다.





#### 세션 제거하기

- 특정 데이터 제거하기

```jsp
session.removeAttribute(String args);
session.removeAttribute("id");
```



- 모든 세션 제거하기

```
session.invalidate();
```

