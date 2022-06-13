# lec06. 반복문을 다루는 방법
<br>

## for-each문
- Java는 : , Kotlin은 in 을 사용한다. 

<br>

## for문을 동작시키는 Progression과 Range
```kotlin
for (i in 1..3) { //1, 2, 3
        println(i)
    }

for (i in 3 downTo 1) { //3, 2, 1
        println(i)
}

for (i in 1..5 step 2) { //1, 3, 5
        println(i)
}
```
- Kotlin은 등차수열과 in을 사용한다.
- IntRange 클래스가 IntProgression 클래스를 상속받는다.

```kotlin
3 downTo 1 : 시작값 3, 끝값 1, 공차 -1인 등차수열
1..5 step 2 : 시작값1, 끝값 5, 공차 2인 등차수열
```
- downTo, step은 중위 호출 함수이다.
    - 기존 함수 호출 방식 : 변수.함수이름(argument)
    - 중위 호출 함수 방식 : 변수 함수이름 argument

<br>

## while 문
- Java와 동일하다.