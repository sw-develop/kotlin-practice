package lec10

class Penguin(
    species: String
) : Animal(species, 2), Flyable, Swimmable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 움직임")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

}