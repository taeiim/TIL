# [HTML] 메타 태그, favicon

### 메타 태그

메타태그는 html문서가 어떤 내용을 담고있고, 문서의 키워드는 무엇이며, 누가 만들었는지 등의 문서 자체의 특징을 담고있다.

```Html
<meta name="description" content="메타 태그에 대한 것">
<meta name="keywords" content="meta, tag, metatag, 메타, 태그">
<meta name="author" content="taeiim">
```

keywords는 이 문서가 어떤 정보를 담고있나 키워드를 써줌.

이런 메타 태그로 검색 엔진이 인식을 해서 검색했을 때 어떤 문서를 먼저 띄워주면 좋겠다 판단도 할 수 있다.



```Html
<meta name="viewport" content="width=divice-width, initial-scale=1.0"
```

viewport는 위에 태그들과는 좀 다르다.

위에 태그들은 정보를 알려주는 것이었다면 viewport는 접속한 디바이스마다 어떻게 표시되면 좋을지 알려준다. width 는 그 넓이를 기기에 넓이값에 맞춰서 표시하는 것이고 initial-scale은 배율이다.





### favicon

favicon 은 인터넷 웹 브라우저의 주소창에 표시되는 웹사이트나 웹페이지를 대표하는 아이콘이다.

예를들어 크롬으로 구글에 들어가면 탭 왼쪽에 구글 아이콘이 있다.

그런 아이콘을 파비콘이라고 한다. 파비콘을 적용하면 좀 더 간지가 난다.



어떻게 적용하냐면

일단 favicon을 구글 검색창에 검색한 후 첫번째로 나오는 사이트에 들어가서

이미지를 favicon으로 변형한다.

그러면 이런게 뜬다.

```Html
<link rel="apple-touch-icon" sizes="57x57" href="/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"  href="/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96" href="/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
<link rel="manifest" href="/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
<meta name="theme-color" content="#ffffff">
```

이걸 복붙해서 적용해주면 된다.

이때 이미지가 저장되어 있는 경로가 다르다면 이미지 경로를 다시 고쳐줘야 한다.