# [JSP] request, response 객체

클라이언트가 서버에 무언가(보통은 웹페이지)를 요청(request)하면, 

서버가 이 요청에 해당되는 것을 응답(response)



## Request

### request 객체

웹브라우저를 통해 서버에 어떤 정보를 요청하는 것

클라이언트에서 어떤 페이지를 요청하면 서버로 요청정보를 하는데, 이렇게 전송된 데이터가 저장되는 곳이 request 객체이다.



### request 내장객체

#### request 내장 객체의 클라이언트 정보메소드

---

- getContextPath() : 프로젝트 path명을 반환

  ```
  요청 : http: //localhost:8080/taeiim/abc.jsp
  리턴값 : /taeiim
  ```

- getRequestURI() :  요청에 사용된 URL로 부터 URI를 리턴  (웹 전체경로(프로젝트명 + 파일경로) 까지 반환)

  ```
  요청 : http: //localhost:8080/taeiim/abc.jsp
  리턴값 : /taeiim/abc.jsp
  ```

- getRequestURL() : URL 을 반환

  ```
  요청 : http: //localhost:8080/taeiim/abc.jsp
  리턴값 : http: //localhost:8080/taeiim/abc.jsp
  ```

- getMethod() : 웹 브라우저가 정보를 전송할 때 사용한 방식을 구한다.  (요청방식 리턴 - get 방식과 post 방식 구분 가능)

- getSession() 

  ```
  request.getSession(true);    // 세션이 존재하면 현재 세션을 반환, 존재하지 않으면 새로운 세션 생성
  request.getSession(false);   // 현재 세션이 존재하면 기존 세션 리턴, 없으면 null값 리턴
  ```

- getProtocol() : 사용중인 프로토콜 리턴

- getQueryString() : 요청에 사용된 Query 문장을 리턴

  ​


#### request 내장 객체의 파라미터 요청 메소드

---

- getParameter(String name) : 파라미터 변수 name에 저장된 변수를 얻어내는 메소드


- getParameterNames() : name 파라미터의 모든 값을 String 배열로 리턴
- getParameterValues(String name) : name에 해당하는 파라미터 값들을 구함.
  - 데이터 값이 여러개 있을 때 사용 (예를들어 checkbox)





## Response 

### response 객체

웹브라우저의 요청에 응답하는 것을 response라고 하며,

이러한 응답(response)의 정보를 가지고 있는 객체를 response객체 라고 한다.



### response 내장 객체

---

##### **response.메소드()**

- addCookie(Cookie) : 쿠키를 지정한다.
- getCharacterEncoding() : 응답할 때 문자의 인코딩 형태를 구한다.
- sendRedirect(URL) : 지정한 URL로 이동

~~~~
String str = request.getParameter("age");
age = Integer.parseInt(str);

if(age>=20){	
	response.sendRedirect("pass.jsp?age="+age);
} else{
    response.sendRedirect("ng.jsp?age="+age);
}
~~~~