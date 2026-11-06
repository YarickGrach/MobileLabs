package task10

open class Vehicle(
    open var speed: Int = 0,
    open var name: String = "Транспорт"
) {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(
    override var speed: Int = 30,
    override var name: String = "Лодка"
) : Vehicle(speed, name)

class Plane(
    override var speed: Int = 900,
    override var name: String = "Самолёт"
) : Vehicle(speed, name)

class Tank(
    override var speed: Int = 50,
    override var name: String = "Танк"
) : Vehicle(speed, name)

fun runTask10() {
    val vehicles: List<Vehicle> = listOf(Boat(), Plane(), Tank())
    for (v in vehicles) {
        v.start()
        v.stop()
    }
}
