class Pasta() {
    private var nom:String = ""
    private var preu:Double = 0.0
    private var pes:Double = 0.0
    private var calories:Int = 0

    constructor(nom: String, preu: Double, pes: Double, calories: Int):this() {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    override fun toString(): String {
        return "${this.nom}, ${this.preu}, ${this.pes}, ${this.calories}"
    }
}