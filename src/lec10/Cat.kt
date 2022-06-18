package lec10

class Cat(
    species: String
) : Animal(species, 4) { //extends 키워드 사용 X -> : 사용

    override fun move() {
        println("야옹")
    }
}