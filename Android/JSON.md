# JSON

## JSON이란?

경량의 데이터 교환 형식

JSON은 사람이 읽고 쓰기에 용이하며, 기계가 분석하고 생성함에도 용이하다.

JavaScript Object Notation의 약자로 JavaScript의 일부에 토대를 두고 있다. 하지만 JSON은 완벽하게 언어로 부터 독립적이다. 



## 형태

**name/value** 쌍으로 구성된다.

"name" : "value "

: 앞에 값은 name 이고 뒤에 값은 value이다.

value에는 큰따옴표 안에 **string, number, object, array, true, false, null** 이 올 수 있다. 

### Object

object는 name/value 쌍들의 비순서화된 set이다. object는 {} 중괄호로 표현한다.

```json
{"id":"abc123","pw":"qwer"}
```



### Array

array는 값들의 순서화된 collection이다. 

```json
["apple","banana","strawberry","grape"]
```

```json
[{"id":"abc123","pw":"qwer"},{"id":"아이디입니당","pw":"비번입니당"},{"id":"itisid","pw":"password"},{"id":"myid","pw":"mypw"}]
```





## 안드로이드에서 사용하기

#### 1. JSON 형태로 만들어주기

예를들어 EditText에 있는 값을 받아온다 하면 

{}와 name, : ,value 값 등을 조합해서 JSON형태로 만들어준다.

```json
String str = "{\"userid\""+":"+"\""+et_id.getText().toString()+"\""+ ","
              + "\"password\""+":" + "\"" + et_pw.getText().toString() + "\"" + "}";
```

복잡해 보이지만 정말 간단하다. 걍 무식하게 다 같다 만든거다.

큰따옴표를 문자로 인식하려면 큰따옴표 앞에 역슬래쉬\를 써줘야 한다.



#### 2. JSONObject나 JSONArray 등등 형태에 맞게 값 저장하기

```json
JSONObject jsonObject = new JSONObject(abc.getText().toString);
```

JSONObject에 JSON형태로 저장



#### 3. name값으로 value값 얻어내기

```json
String id = jsonObject.getString("name");
```

name 값으로 value값을 얻어낸다.