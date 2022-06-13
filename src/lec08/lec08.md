# lec08. 함수를 다루는 방법
<br>

## 함수 선언 방법
```kotlin
접근지시어 fun 함수이름(파라미터): 반환타입 {
    
}
```
```kotlin
fun max(a: Int, b: Int): Int = if (a > b) a else b
fun max(a: Int, b: Int) = if (a > b) a else b
```
- 메서드의 Body가 하나의 값으로 간주되는 경우 {}를 없앨 수 있고, {}가 없다면 메서드 반환 타입 생략 가능하다.

<br>

## default parameter
```kotlin
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    ...
}
```
- 함수의 파라미터에 기본값을 설정해줄 수 있다.

<br>

## named argument (parameter)
```kotlin
fun main() {
    repeat("Hello World", useNewLine = false)    
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    ...
}
```
- 매개변수 이름을 통해 전달할 값을 직접 지정할 수 있다. 이를 named argument라고 한다.
- 지정되지 않은 매개변수는 기본값을 사용한다. (default parameter를 사용했을 때)
- builder를 직접 만들지 않아도 builder의 장점을 가지게 된다.
- 다만, Java 함수를 가져다 사용할 때는 named argument를 사용할 수 없다.
    - JVM 상에서 Java가 바이트 코드로 변환됐을 때 메서드의 parameter의 이름을 보존하고 있지 않으므로 사용할 수 없다.
    
<br>

## 같은 타입의 여러 파라미터 받기 (가변인자)
```kotlin
fun main() {
    val arr = arrayOf("A", "B", "C")
    printAll(*arr) //* : spread 연산자
}

fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}
```
- 가변인자에는 vararg 키워드를 사용한다.
- 가변인자 함수의 파라미터에 배열을 넣어 호출할 때는 *(spread 연산자)를 붙여줘야 한다.