# lec04. 코틀린에서 연산자를 다루는 방법
<br>

## 단항 연산자 / 산술 연산자
- Java와 동일

<br>

## 비교 연산자와 동등성, 동일성
> 비교 연산자
- Java와 동일하지만, Java와 다르게 객체를 비교할 때
    - 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다.
    
```kotlin
fun main() {

    val m1 = JavaMoney(2_000L)
    val m2 = JavaMoney(1_000L)

    if (m1 > m2) { //compareTo 연산자를 자동으로 호출함
        println("m1이 m2보다 금액이 큽니다")
    }
}
```

> 동등성, 동일성
- 동등성(Equality) : 두 객체의 값이 같은가
- 동일성(Identity) : 완전히 동일한 객체인가, 즉 주소가 같은가

- Java에서는
    - 동등성 비교 : equals 직접 호출
    - 동일성 비교 : == 사용
    
- Kotlin에서는
    - 동등성 비교 : == 호출 (==를 사용하면 간접적으로 equals를 호출해줌)
    - 동일성 비교 : === 호출

<br>

## 논리 연산자 / 코틀린에 있는 특이한 연산자
> 논리 연산자
- Java와 동일
- Java처럼 Lazy 연산을 수행한다.

> 코틀린에 있는 특이한 연산자
- in / !in
  - 컬렉션이나 범위에 포함되어 있다, 있지 않다.
  
- a..b
  - a부터 b 까지의 범위 객체를 생성한다.

- a[i]
  - a에서 특정 index i로 값을 가져온다.
  
- a[i] = b
  - a의 특정 index i에 b를 넣는다.
  
<br>

## 연산자 오버로딩
- Kotlin에서는 객체마다 연산자를 직접 정의할 수 있다.
```kotlin
data class Money(
    val amount: Long
) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    } //+ 연산자 오버로딩
}

//main함수 
fun main() {
  val money1 = Money(1_000L)
  val money2 = Money(2_000L)
  println(money1 + money2) //Money 클래스에서 + 연산자를 오버로딩하여 이렇게 사용 가능함
}
```


