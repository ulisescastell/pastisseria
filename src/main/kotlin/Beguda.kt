class Beguda() {
    private var nom:String = ""
    private var preu:Double = 0.0
    private var teSucre: Boolean = false

    constructor(nom: String, preu: Double, teSucre: Boolean):this() {
        this.nom = nom
        this.preu = preu
        this.teSucre = teSucre
    }

    override fun toString(): String {
        return "Tipus: ${this.nom}, Preu: ${this.preu}, Ensucarat: ${this.teSucre}"
    }
}