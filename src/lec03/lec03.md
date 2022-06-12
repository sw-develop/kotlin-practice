# lec03. 코틀린에서 Type을 다루는 방법
<br>

## 기본 타입
```kotlin
val num1 = 3 //Int
val num2 = 3L //Long

val num3 = 3.0f //Float
val num4 = 3.0 //Double
```
- 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.

```kotlin
val num1 : Int = 4
val num2 : Long = num1.toLong()

println(num1 + num2)
```
- 기본 타입간의 변환은 명시적으로 이뤄져야 한다. (Java에서 암시적으로 이뤄짐)

<br>

## 타입 캐스팅
```java
//기존 Java에서의 타입 캐스팅
public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
    Person person = (Person) obj;
    System.out.println(person.getName());
    }
}
```
```kotlin
//Kotlin에서의 타입 캐스팅
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { //instanceof와 동일함
        val person = obj as Person //타입 캐스팅
        println(person.name)
    }
}

//스마트 캐스트 
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.name) //컴파일러가 if문을 보고 자동으로 파악해줌
    }
}
```

### 정리
> 타입 확인
- value is Type 에서
    - value가 Type이면 --> true
    - value가 Type이 아니면 --> false
    
- value !is Type에서
    - value가 Type이면 --> false
    - value가 Type이 아니면 --> true

> 타입 캐스팅
- value as Type 에서
    - value가 Type이면 --> Type으로 타입 캐스팅
    - value가 Type이 아니면 --> 예외 발생

- value as? Type에서
    - value가 Type이면 --> Type으로 타입 캐스팅
    - value가 null이면 --> null
    - value가 Type이 아니면 --> null

<br>

## Kotlin의 3가지 특이한 타입
> Any
- Java의 Object 클래스 역할
- 모든 Primitive Type의 최상위 타입도 Any이다.
- Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현해야 한다.
- Any에 equals / hashCode / toString 메서드 존재한다.

> Unit
- Java의 void와 동일한 역할
- Java의 void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다. (제네릭 관련)

> Nothing
- 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
- 무조건 예외를 반환하는 함수 / 무한 루프 함수 등에 사용한다.
    - 해당 함수들을 만들 일이 없어 거의 사용하지 않는다.
```kotlin
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
```

<br>

## String Interpolation, String indexing
- 문자열을 가공할 때 ${변수}와 """ """를 사용하면 깔끔하게 작성할 수 있다.
- 문자열에서 문자 가져올 때 Java의 배열처럼 []를 사용한다.

```kotlin
val person = Person("Pooh", 100)
val log = "이름은 ${person.name}이고, 나이는 ${person.age}이다."
```
```kotlin
val withoutIndent = 
    """
        ABC
        123
    """.trimIndent()
println(withoutIndent) //ABC\n123
```
