fun main () {

    println("-----------------------------")
    println("Bolleria/pasta: ")
    println("-----------------------------")

    val croissant: Pasta = Pasta("Croissant", 1.75, 45.0, 200)
    val ensaimada: Pasta = Pasta("Ensaimada", 2.25, 120.0, 670)
    val donut: Pasta = Pasta("Donut", 2.0, 75.0, 400)
    println(croissant)
    println(ensaimada)
    println(donut)

    println("-----------------------------")
    println("Begudes:")
    println("-----------------------------")

    val aigua = Beguda("Aigua", 1.00, false)
    val cafeTallat = Beguda("Cafè tallat", 1.35, false)
    val teVermell = Beguda("Té vermell", 1.50, false)
    val cola = Beguda("Cola", 1.65, true)

    println(aigua)
    println(cafeTallat)
    println(teVermell)
    println(cola)

}