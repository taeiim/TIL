# [JSP] 액션태그

#### 액션태그 정의

JSP 페이지 내에서 어떤 동작을 하도록 지시하는 태그



## 액션태그 알아보기

forward, include, param, bean 태그가 있다.

bean태그는 다음에 알아보자



#### forward

페이지를 전환할 때 사용한다.

```Jsp
<jsp:forward page="전환할 페이지"/>
``` 

그러면 현재 페이지에서 "전환할 페이지"로 페이지가 전환된다.



#### param

데이터 전달을 목적으로 사용되는 태그

요청한 페이지로 정보를 전달한다.

요청한 페이지로 인자(parameter)와 인자값(value) 형태로 값을 넘겨준다.

```Jsp
<jsp:param name="id" value="taeiim"/>
```



param 태그는 forward 나 include 태그와는 달리 단독으로 사용하지는 못한다.

include 태그나 forward 태그 안에 사용한다.

```Jsp
<jsp:forward page="전환할 페이지 이름.jsp">
	<jsp:param name="id" value="taeiim"/>
  	<jsp:param name="pw" value="비밀!!"/>
</jsp:forward>
```

이렇게 값을  보내주면 request 객체를 사용해서 값을 받아준다.

```jsp
<%
  id = request.getParameter("id");
  pw = request.getParameter("pw");
%>
```





#### include

현재 페이지에 다른 페이지를 포함시키기 위해 사용

다른 페이지의 실행 **결과값**을 해당 JSP페이지에 포함시킨다.

포함되는 페이지는 HTML, JSP, Servlet 페이지 등등 모두 가능

```Jsp
<jsp:include page="포함될 페이지" flush="false"/>
```



**flush 속성**은 포함될 페이지로 제어가 이동할 때 포함하는 페이지가 지금까지 출력 버퍼에 저장한 결과를 처리하는 방법을 결정한다.

'ture'로 지정하면 포함할 페이지의 내용을 삽입하기 전에 현재 페이지가 지금까지 버퍼에 저장한 내용을 출력한다.



**flush 속성값은 "false"로 지정하는 것이 일반적**

만약 flush 속성의 값을 'true'로 지정하게 되면 일단 출력 버퍼의 내용을 웹 브라우저에 전송하게 되는데 이때 헤더 정보도 같이 전송된다. 

일단 헤더정보가 웹 브라우저에 전송이 되고 나면 헤더 정보를 추가해도 결과가 반영되지 않는다.
