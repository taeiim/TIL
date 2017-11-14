# Kotlin 기본문법1

## 리얼 기본

- 코틀린은 세미콜론( ; ) 을 사용하지 않는다. 
- 주석처리는 자바와 동일하다.



## 로컬 변수

자바와 다르게 코틀린에는 2가지의 변수 형이 있다. 

또한,  타입을 지정해주지 않아도 된다. (단, 변수에 값을 할당하지 않을 경우 타입 필요)

#### 1. val

read-only, 불변 상수로 한번 초기화된 이후에는 수정할 수 없다. Java의 final에 해당한다. 

```kotlin
val a = 1  // Int 타입으로 추론 
val b : Int = 1  
val c : Int  // 변수에 값 할당 하지 않으면 타입을 지정해주어야 한다. 
c = 1 
```



#### 2. var

수정이 가능한 변수, 일반적인 변수에 해당한다. 

```kotlin
var a = 1
a += 1
```





## 함수

### in Java

```kotlin
public int sum(int x, int y){
  return x + y;
}
```



### in Kotlin

- ##### 2개의 Int 파라미터, Int 리턴 타입

  ```kotlin
  fun sum (x : Int, y : int) : Int{   // fun 함수명 (변수명 : 변수타입) : 리턴 타입
    return x + y;
  }
  ```

  ​


- ##### 2개의 Int 파라미터, 의미없는 값 리턴

  어떤 값도 리턴하지 않는 함수의 리턴타입은 **Unit** 이다. 

  ```kotlin
  fun sum (x : Int, y : int) : Unit {   // Unit은 생략이 가능하다. 
    print(x+y)
  }
  ```

  ​

- ##### 단일 식 함수 

  식으로 짧게 표현 ( 한줄 함수 ) 

  return 타입을 추론해서 컴파일러가 알아서 지정해주므로 리턴 타입 지정을 생략할 수 있다. 

  ```kotlin
  fun sum (x : Int, y : Int ) = x + y
  ```





## 조건문

### if 문

if문은 자바와 동일하다.

```kotlin
if(a == 1){
 println("a는 1")
} else if(a == 2){
  println("a는 2")
}
```



### when

자바의 switch-case 문

```kotlin
var num = 1
when(num){
  1 -> {  
    println("num은 1")
  }
  // 코드 블록이 한 줄일 경우 중괄호 생략 가능
  2 -> println("num은 2")
}
```



##### 인자의 타입이 Any

Any 는 자바의 Object 역할을 한다. 

그래서 인자의 타입이 Any 인 경우 모든 타입을 대입할 수 있기에 매우 유연하다. 

```Kotlin
fun cases (num: Any){
  when(num){
    1 -> println("1이다.")
    "taeim" -> println("내 이름은 taeim")
    is Long -> println("Long")
    is String -> println("String")
    !is String -> println("not String")
    else -> println("====")
  }
}
```





## 반복문

### for 문

코틀린에서 for문은 범위 (ranges), 배열, Map 등을 반복하는데 사용한다. 

- **1부터 10까지 출력**

  ```kotlin
  for (num in 1..10){  //ranges
    println(num)
  }
  ```

##### ranges

숫자의 범위를 지정하여 사용한다. 

 **1..10** 은 1~10 값을 의미한다. 



- **배열 출력 **

  ```kotlin
  val arrayList = ArrayList<String>()
  for(str in arrayList){
    println(str)
  }
  ```

  ​

### while 문

Java의 while문과 동일하다. 

```kotlin
val num = 1
while (num < 10){
  num++
}
```



### do-while 문

Java의 do-while문과 같다.

```kotlin
val num = 0
do{
  num++
}while (num < 10){
  num++
}
```



