package lec06

fun main() {

    //Java의 for-each
    val numbers = listOf(1L, 2L, 3L)
    for (num in numbers){
        println(num)
    }

    //Java의 for
    for (i in 1..3) { //1, 2, 3
        println(i)
    }

    for (i in 3 downTo 1) { //3, 2, 1
        println(i)
    }

    for (i in 1..5 step 2) { //1, 3, 5
        println(i)
    }

    //Java의 while
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}