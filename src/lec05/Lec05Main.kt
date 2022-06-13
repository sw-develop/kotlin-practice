package lec05

import java.lang.IllegalArgumentException
import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun validateScoreIsNotNegative(score: Int) { //반환형 void 타입인 Unit 생략 가능
    if (score < 0) {
        throw IllegalArgumentException("${score}은 0보다 작을 수 없음")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        println("Pass")
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean { //Object 대신 Any가 최상위 클래스
    return when (obj) {
        is String -> obj.startsWith("A") //스마트 캐스트
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when { //Java의 early return 처럼 사용 가능
        number == 0 -> println("0입니다.")
        number % 2 == 0 -> println("짝수입니다.")
        else -> println("홀수입니다.")
    }
}