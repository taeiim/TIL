# [HTML] 기본태그_2

#### 홀태그

일반 적인 태그는 <태그>로 시작하면 </태그>로 닫아주어야 한다.

하지만 </태그> 즉, 닫는 태그가 없는 태그를 **홀태그** 라고 한다.

홀태그에는 br,hr,img,meta,input 등이 있다.



#### a태그

a태그로 글씨나 문장, 사진에 **링크**를 걸어준다.

```html
<a href="https://링크"> 누르면 링크로 넘어감 </a>
```

**새창**으로 열때에는 target 지정

```html
<a href="https://링크" target="blank"> 누르면 링크로 넘어감 새창에서 열림 </a>
```



#### 해시태그

같은페이지에서 내가 원하는 위치로 이동할 때 해시태그를 사용한다.

예를들어 목차가 있으면 어떤 목차를 누르면 그 목차에 해당하는 글이 뜨드록한다.

```html
<ul>
  <li>
    <a href="#choco">초코</a>
  </li>
  <li>
    <a href="#strawberry">딸기</a>
  </li>
  <li>
    <a href="#banana">바나나</a>
  </li>
</ul>

<ol>
  <li id="choco">
    위에서 choco 누르면 요거 있는 곳으로 이동한다!!
  </li>
  <li id="strawberry">
    위에서 strawberry 누르면 요거 있는 곳으로 이동한다!!
  </li>
  <li id="banana">
    위에서 banana 누르면 요거 있는 곳으로 이동한다!!
  </li>
  
</ol>
```



#### button

버튼을 만들 때는 button 태그!

```html
<button> 난 버튼 </button>
```

버튼이 만들어 졌다.

이 버튼을 누르면 다른 링크로 이동하고 싶을 때는?

```html
<a href="https://링크복붙하세용">
  <button> 난 버튼 </button>
</a>
```

요렇게 하면 해당 링크로 이동한다!!



