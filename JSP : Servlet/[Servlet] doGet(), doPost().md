# [Servlet] doGet() , doPost()

## 서블릿 클래스 작성하기

서블릿 클래스를 작성할 때 지켜야 할 첫 번째 규칙은 **javax.servlet.http.HttpServlet** 클래스를 상속받도록 만들어야 한다.

그리고 이 클래스는 public으로 만들어야 한다. 왜냐하면 서블릿 클래스를 public으로 선언해야 웹 컨테이너가 서블릿 객체를 만들 때 이 접근 권한이 필요하기 때문이다.

```
public class first_Ex extends HttpServlet{
  
}
```



그 다음에는 서블릿 클래스 안에 doGet 또는 doPost 메소드를 선언해야 한다.



## doGet() , doPost() 

Get방식과 Post 방식은 HTTP프로토콜을 이용해서 서버에 무언가를 전달할 때 사용하는 방식이다.

클라이언트에서 요청하는 방식이 Get, Post 방식 2가지가 있다.

HTML 내의 form 태그의 method 속성에 따라 호출된다.

```
<form action="PostMethod" method="post">
```

—post 메소드 호출



### doGet()

---

입력 데이터가 URL 뒤에 붙어서 전송

예를들어 네이버 검색창에 'hello' 라고 검색해보면

```
https://search.naver.com/search.naver?where=nexearch&sm=top_sly.hst&fbm=0&ie=utf8&query=hello
```

뒤에 샬라샬라샬라 정보가 붙어서 나온다. 

그래서 입력 데이터의 크기가 아주 클 경우 웹 브라우저가 웹 서버로 전송하는 URL의 길이에 한계가 있기 때문에 문제가 된다. 또한, URL 값으로 정보가 전송되어 보안에 약하다.



#### doGet 메소드 작성방법

```
public class first_Ex extends HttpServlet{
  public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    // throws절에서는 ServletException과 IOException 생략가능, 하지만 새로운 익셉션 추가는 불가능
    
    
  }
}
```

**doGet 메소드를 public으로 선언해야 하는이유**

나중에 웹 컨테이너가 웹 브라우저로부터 요청을 받아서 이 메서드를 호출할 때 필요하기 때문





### doPost()

---

입력 데이터가 URL이 아닌 별도의 영역을 통해 전송

```
http://localhost:8080/Study_JSP/FormEx
```

header를 이용해 정보가 전송되어 보안에 강하다.



#### doPost 메소드 작성방법

**doGet** 메소드와 작성방법이 동일하다.

public 키워드를 붙여서 선언하고, 파라미터 변수, 리턴타입, 익센셥 타입도 doGet 메소드와 같다.

```
public class first_Ex extends HttpServlet{
  public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    
  }
}
```





### 언제 Get을 쓰고 언제 Post를 쓸까??

---

데이터 **조회용** 애플리케이션은 **Get** 메소드를 사용하는 것이 적당하고

데이터 **저장용** 애플리케이션은 **Post** 메소드를 사용하는 것이 적당하다.
