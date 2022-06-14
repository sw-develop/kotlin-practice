# lec09. 클래스를 다루는 방법
<br>

## 클래스와 프로퍼티
- 프로퍼티 = 필드 + getter + setter
- 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다.

```kotlin
//아래 2개의 클래스는 동일한 표현 

class JavaPerson constructor(name: String, age: Int) { //주생성자

    val name: String = name
    var age: Int = age
}

class JavaPerson( //주생성자
    val name: String,
    var age: Int
)
```
- 코틀린에서는 주생성자가 필수이다.
- 코틀린에서는 constructor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
    - 단, 부생성자 대신 default parameter나 정적 팩토리 메서드를 사용하는 것을 추천한다.

<br>

## 커스텀 getter, setter
- 실제 메모리에 존재하는 것과 무관하게 custom getter, setter를 만들 수 있다.

### getter
```kotlin
//아래 3가지 모두 동일한 표현

fun isAdult(): Boolean {
    return this.age >= 20
}

val isAdult: Boolean
    get() = this.age >= 20 //커스텀 getter 

val isAdult: Boolean
    get() {
        return this.age >= 20 //커스텀 getter
    }
```
- 위의 3가지 모두 동일한 기능이고 표현 방법만 다르다.
- 객체의 속성이라면, 커스텀 getter / 그렇지 않다면 함수 표현 (꼭 지켜야 하는 것은 아님)

### setter
```kotlin
class Person(
  name: String, 
  var age: Int
) {
    var name: String = name
        set(value) {
            field = value.uppercase() //커스텀 setter, backing field 사용
        }
}
```
- Setter 자체를 지양하기 때문에 커스텀 setter도 잘 사용하지 않는다.

<br>

## backing field
- custom getter, setter에서 무한루프를 막기 위해 field 키워드를 사용한다.
  - 이를 backing field라고 부른다.

```kotlin
class Person(
  name: String,
  var age: Int,
) {
    val name: String = name //주생성자에서 받은 name을 불변 프로퍼티 name에 바로 대입
        get() = field.uppercase() //커스텀 getter
}

class Person(
  val name: String,
  var age: Int
) {
  val upperCaseName: String
    get() = this.name.uppercase()
}
```
- name에 대한 커스텀 getter를 만들 때 field를 사용
- field : 무한루프를 막기 위한 예약어, 자기 자신을 가리킨다.
  - 위의 예시에서는 name을 가리킴
  
- backing field를 사용해서 커스텀 getter를 만드는 경우가 거의 없다.