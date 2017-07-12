# [HTML] div, span, table

## div

레이아웃을 나눌 때 주로 쓰인다.

가로 크기가 영역에 꽉차게 설정되는데, css의 float속성을 이용하면 내용에 맞춰 설정할 수 있다.

폭과 넓이 지정할 수 있고 테이블을 대체하며 레이아웃 배치 용도로 주로 쓰인다.

```Html
<div> 샬라샬라 </div>
```

```html
<div style="width:500px; height:300px">style1</div>
<div style="backgroud-color: #FFFFCC;">style2</div>
<div style="backgroud-color: rgb(255,255,255);">rgb사용</div>
```



## span

span 태그안의 내용만큼의 가로폭만 차지한다. 폭과 넓이를 지정할 수 없다.



## table

표를 만드는 태그

\<table> 태그 안에 \<tr>, \<td> 태그 등을 써서 사용한다.

 이때 \<tr>은 table row 로 열을 나타내고, \<tb>는 행을 나타낸다.

```html
<table>
  <tr>
  	<td>1</td>
    <td>2</td>
  </tr>
  <tr>
  	<td>3</td>
    <td>4</td>
  </tr>
</table>
```

이렇게 하면

12

34

요렇게 table 형식으로 출력된다.



#### colspan , rowspan

colspan 은 가로 셀을 합치고, rowspan 은 세로 셀을 합친다.

```html
<td colspan="2">가로로 2칸 합침</td>
<td rowspan="2">세로로 2칸 합침</td>
```





