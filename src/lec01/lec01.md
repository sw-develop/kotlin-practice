# lec01. 코틀린에서 변수를 다루는 방법
<br>

## 변수 선언 키워드 - var과 val의 차이점
- 모든 변수에는 var / val을 붙여 줘야 한다.
    - var : 변경 가능한 변수
    - val : 변경 불가능 변수 (Java에서의 final)
    
- 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.
```kotlin
var num1 = 10L
var num2: Long = 20L //타입 명시적 작성 가능
```

- 간단 TIP   
  - 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.

<br>

## Kotlin에서의 Primitive Type
- Primitive Type과 Reference Type을 구분하지 않아도 된다.
    - 숫자, 문자, boolean 같은 몇몇 타입은 내부적으로 특별한 표현을 가진다.
    - 이 타입들은 실행시에 Primitive Value로 표현된다. 
    - 즉, 프로그래머가 boxing / unboxing을 고려하지 않아도 되도록 Kotlin이 알아서 처리 해준다.

## Kotlin에서의 nullable 변수 
- Null이 들어갈 수 있는 변수는 타입 뒤에 ?를 붙여줘야 한다.
    - 아예 다른 타입으로 간주된다.
```kotlin
var num3 : Long? = 1_000L
num3 = null
```

<br>

## Kotlin에서의 객체 인스턴스화
- Kotlin에서 객체 인스턴스화를 할 때 new 키워드를 붙이지 않는다.
```kotlin
val person = Person("Pooh")
```