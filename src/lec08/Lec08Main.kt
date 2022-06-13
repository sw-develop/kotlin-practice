package lec08

fun main() {
    repeat("Hello World")

    //가변인자
    printAll("A", "B", "C")

    val arr = arrayOf("A", "B", "C")
    printAll(*arr) //* : spread 연산자
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    }
    else b
}

fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) = if (a > b) a else b //반환 타입 생략

//default parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

//가변인자
fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}