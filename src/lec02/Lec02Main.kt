package lec02

import java.lang.IllegalArgumentException

fun main() {
    val str1: String? = "ABC"
    println(str1?.length)

    val str2: String? = null
    println(str2?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}