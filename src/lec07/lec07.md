# lec07. 예외를 다루는 방법
<br>

## try-catch-finally 구문
- 문법적으로는 Java와 완전히 동일하다.
- Kotlin에서는 try-catch가 Expression이기 때문에 바로 return이 가능하다.

<br>

## Checked Exception과 Unchecked Exception
- Kotlin에서는 Checked Exception과 Unchecked Exception을 구분하지 않는다.
    - 모두 Unchecked Exception이다.
  
<br>

## try-with-resources 
- Kotlin에서는 해당 구문이 없다.
- 대신, 코틀린의 언어적 특징을 활용해 close를 호출해준다.