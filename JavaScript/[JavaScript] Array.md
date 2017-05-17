# [JavaScript] 배열

### 배열 생성

```Java
var arrays = [1,2,3,4]
```

[] (대괄호) 를 사용해서 배열을 만든다.  대괄호 안에 데이터를 콤마(,)로 구분해서 나열하면 배열이 된다.



## 배열의 제어

### 배열 크기

length를 사용해서 배열의 크기를 알아낼수 있다. 결과는 7이다.

```javascript
var arr = [1,2,3,4,5,6,7];
alert(arr.length);
```



### 배열에 원소 추가하기

#### push

배열 끝에 원소를 추가하는 방법

```javascript
var arr = ['a','b','c','d'];
arr.push('e');
alert(arr);
```

출력결과 : abide



#### concat

복수의 원소를 배열에 추가하는 방법

```javascript
var arr = ['a','b','c','d','e'];
arr = arr.concat(['f','g']);
alert(arr);
```

출력결과 : abcdefg 



#### unshift

배열의 시작점에 원소를 추가하는 방법

인자로 전달한 값을 배열의 첫번째 원소로 추가하고 기존에 있던 값들은 배열값을 1씩 증가시킨다.

```javascript
var arr = ['b','c','d','e'];
arr.unshift('a');
alert(arr);
```

출력결과 : abcde



### 원소 제거하기

#### shift

배열의 첫번째 원소를 제거

```javascript
var arr = ['a','b','c','d','e'];
arr.shift();
alert(arr);
```

출력결과 : bcde



#### pop

배열 끝의 원소를 제거

```javascript
var arr = ['a','b','c','d','e'];
arr.pop();
alert(arr);
```

출력결과 : abcd



### 원소 정렬하기

#### sort

배열을 정렬하는 방법

```javascript
var arr = ['c','a','d','e','b',];
arr.sort();
alert(arr);
```

출력결과 : abcde



#### reverse

```javascript
var arr = ['c','a','d','e','b',];
arr.reverse();
alert(arr);
```

출력결과 : edcba