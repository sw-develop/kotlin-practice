# lec02. 코틀린에서 null을 다루는 방법
<br>

## Kotlin에서의 null 체크
- nullable 타입은 null인지 아닌지 확인이 필수로 필요하다.
  - 한 번 null 체크를 하면 non-null임을 컴파일러가 알 수 있다. 

<br>

## Safe Call과 Elvis 연산자
<br>

### Safe Call
```kotlin
val str: String? = "ABC"
str.length //불가능
str?.length //가능 !! --> Safe Call
```
- str?.length 에서 str이 null 아니면 해당 코드를 실행하고, null이면 실행하지 않는다. (그대로 null이 됨)

### Elvis 연산자
```kotlin
val str: String? = "ABC"
str?.length ?: 0
```
- 앞의 연산 결과가 null이면 뒤의 값을 사용한다.

<br>

## null이 아님을 단언 - Not-null assertion(!!)
- nullable type이지만, 논리적으로 절대 null이 될 수 없는 경우
```kotlin
fun startsWithA1(str: String?): Boolean {
    return str!!.startsWith("A") //nullable이지만 절대 null이 될 수 없음을 컴파일러에게 명시
}
```
- 하지만, 위의 코드에서 str에 null 값이 들어오면 NullPointerException이 발생하기 때문에 정말 null이 아님이 확실한 경우에만 사용해야 한다.
  - 그게 아니라면 사용 X
- Java에 비해 가독성 측면에서 NPE가 발생할 가능성이 있는 지점을 명시적으로 보여주는 장점이 있다.

<br>

## 플랫폼 타입 
- Java와 Kotlin을 함께 사용할 때 주의해야할 타입

```java
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Nullable
  public String getName() {
    return this.name;
  }
}
```
- 위의 Java 코드에서 @Nullable 어노테이션이 없다면 Kotlin에서는 해당 값이 nullable인지 아닌지 알 수 없다.
- 이러한 Kotlin이 null 관련 정보를 알 수 없는 타입 == 플랫폼 타입 이라 한다.
- Runtime 시 Exception이 날 수 있다.
- Java 코드 읽으며 null 가능성 확인 / Kotlin으로 wrapping
