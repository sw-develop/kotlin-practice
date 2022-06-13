package lec07

import java.lang.IllegalArgumentException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt() //기본 타입 간의 형변환은 toType()을 사용함
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}은 숫자가 아님")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt() //기본 타입 간의 형변환은 toType()을 사용함
    } catch (e: NumberFormatException) {
        null
    }
}