# [JSP] 예외페이지

## 미리 알고가기

#### 주요 응답 상태 코드

\- 200 : 요청이 정상적으로 처리 됨

\- 307 : 임시로 페이지가 리다이렉트 됨

\- 400 : 클라이언트의 요청이 잘못된 구문으로 구성 됨

\- 401 : 접근이 허용되지 않음

\- 404 : 지정된 URL 을 처리하기 위한 자원이 존재하지 않음

\- 405 : 요청된 메서드는 허용되지 않음

\- 500 : 서버 내부 에러 (JSP에서 익셉션이 발생하는 경우)
 
\- 503 : 서버가 일시적으로 서비스를 제공할 수 없음 (급격하게 부하가 몰리거나 서버가 임시 보수 중인 경우)



---



## page 지시자를 이용한 예외 처리

JSP페이지에 직접 에러페이지를 표시해주는 방식이다.

JSP페이지를 처리하는 도중에 익셉션이 발생할 경우 기본 에러 페이지 대신 지정한 JSP 페이지를 보여준다.

```Jsp
<%@ page errorPage = "errorPage.jsp" %>
```

이 화면에서 에러가 발생하면 특정 페이지(예외가 발생했을 때 보여주는 페이지, 여기서는 errorPage.jsp)로 넘어간다.



#### 예외가 발생했을 때 보여주는 페이지 

```Jsp
<%@ page isErrorPage = "true" %>
```

isErrorPage 속성을 true로 해줌으로써 이 페이지가 에러페이지임을 알려준다.

속성이 true여야 exception 기본객체를 사용할 수 있다.

기본적으로 디폴트값은 false 이다. 만약 false 이면 exception 객체를 참조할 수 없다.



```Jsp
<% response.setStatus(200); %>
```

웹 페이지는 status 라는 상태값을 가지고 있다.

이 상태값으로 현재 웹 페이지가 정상인지 에러인지 알 수 있다.



지금 이 페이지는 에러페이지가 아니고 에러라고 알려주기 위한 정상적인 페이지이다. 하지만 간혹 status가500(오류) 인 상태로 설정이 되는 경우가 있다. 

그래서 response.setStatus(200) 을 이용해서 현재 페이지는 정상적인 페이지라고 알려준다. 여기서 200은 에러가 없이 정상적으로 전송되었음을 뜻한다.





## web.xml 파일을 이용한 예외 처리

page 지시자를 이용하지 않고 web.xml 을 이용한 예외 처리 방법이다.

```jsp
<error-page>
  <error-code>404</error-code>   
  <location>/error404.jsp</location>    //404에러 발생시 error404.jsp 페이지로 이동
</error-page>
<error-page>
  <error-code>500</error-code>
  <location>/error500.jsp</location>    //500에러 발생시 error500.jsp 페이지로 이동
</error-page>
```

error-page 태그안에 error-code 태그와 location 태그를 사용한다.

error-code 태그에는 상태값을 세팅해주고 location 태그에는 해당 상대값일 경우 표시해줄 에러페이지의 위치를 설정해준다.





## exception-type 태그를 이용한 예외 처리

두번째 방법과 마찬가지로 web.xml 파일에서 작업이 이루어진다.

Exception의 타입별로 에러페이지를 지정해준다.

```jsp
<error-page>
  <exception-type>java.lang.ArithmeticException</exception-type>
  <location>/error/error500.jsp</location>
</error-page>
```





## 에러페이지의 우선 순위

1. page 디렉티브의 errorPage 속성에서 지정한 에러 페이지를 보여준다.
2. 발생한 익셉션 타입이 web.xml 파일의 < exception-type > 에서 지정한 타입과 동일한 경우 지정한 에러페이지를 보여준다.
3. 발생한 에러코드가 web.xml파일의 < error-code > 에서 지정한 에러 코드와 동일한 경우 지정한 에러페이지를 보여준다.
4. 아무것도 해당되지 않을 경우 웹 컨테이너가 제공하는 기본 에러 페이지를 보여준다. 
