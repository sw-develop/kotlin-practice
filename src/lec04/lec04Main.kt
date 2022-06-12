package lec04

fun main() {

    //비교 연산자
    val m1 = JavaMoney(2_000L)
    val m2 = JavaMoney(1_000L)
    val m3 = m1
    val m4 = JavaMoney(2_000L)

    if (m1 > m2) { //compareTo 연산자를 자동으로 호출함
        println("m1이 m2보다 금액이 큽니다")
    }

    //동등성, 동일성 비교
    println(m1 === m3) //true
    println(m1 === m4) //false
    println(m1 == m4) //true

    //연산자 오버로딩
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1.plus(money2))
    println(money1 + money2) //위와 동일한 표현
}