package lec09

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("Pooh", 2)
    println(person.name) //getter
    person.age = 3 //setter
    println(person.age)

    val person2 = Person("Tiger")
}

class Person( //주생성자
    val name: String,
    var age: Int
) {
    init { //초기화 블록은 생성자가 호출되는 시점에 호출됨
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String): this(name, 1) //부생성자 추가

    fun isAdult(): Boolean {
        return this.age >= 20
    }
}