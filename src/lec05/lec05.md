# lec05. 코틀린에서 조건문을 다루는 방법
<br>

## if문
- if / if-else / if-else if-else 모두 Java와 동일하다.

<br>

## Expression과 Statement
- Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다. (Expression을 포함하고 있음)
- Expression: 하나의 값으로 도출되는 문장
- Java에서 if-else는 Statement이지만, Kotlin에서는 Expression이다.
- Kotlin에서는 if-else를 expression으로 사용할 수 있기 때문에 삼항 연산자가 없다.

<br>

## switch와 when
- Kotlin에서는 switch문이 없고, when을 사용한다.
    - when도 Expression이기 때문에 바로 return할 수 있다.

```kotlin
when (값) {
    조건부 -> 어떠한 구문
    조건부 -> 어떠한 구문        
    else -> 어떠한 구문                 
}
```
- (값)은 생략 가능하다.