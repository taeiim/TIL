# [Kotlin] 기본문법2

## Nullable

```kotlin
fun haha(a: String, b: String?){ ... }
```

String뒤에 붙어있는 저 물음표가 코틀린에서는 Java의 Nullable을 의미한다.

즉, Java) **@Nullable String b** 과 Kotlin) **b: String?** 과 동일하다.



## DTO (Data Transfer Object) 만들기

**DTO** 란 데이터를 오브젝트로 변환하는 객체이다. 

이건 완전 대박!!!

#### in Java

JAVA에서는 아래와 같이 매일 getter/setter 등을 직접 만들어주었다.

```java
class Persson{
  private String name;
  private int age;
  private String gender;
  
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  
  public void setTitle(String title) {
      this.title = title;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public String getGender() {
      return gender;
  }

  public void setGender(String gender) {
      this.gender = gender;
  }
  
}
```



#### in Kotlin DTO

이렇게 긴 코드를 코틀린!!에서는 한줄로!!!

```kotlin
data class Person(var name: String, var age: Int, var gender: String)
```

코틀린에서는 **data class**를 별도로 제공한다. 

이 한줄의 코드는 getter/setter 뿐만 아니라 equals(), hashCode(), toString(), copy() 클래스도 제공한다.

