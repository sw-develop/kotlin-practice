package lec03

fun main() {
    //기본 타입 형반환시 .to변환타입()을 사용해 명시적 형변환
    val num1 = 3
    val num2: Long = num1.toLong()

    //변수 nullable일 때 처리 - Safe Call과 Elvis 연산자
    val num3: Int? = 3
    val num4: Long = num3?.toLong() ?: 0
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.name)
    }
}