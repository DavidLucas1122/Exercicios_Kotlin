fun main () {
    fun descobrirMedia (
        nota1: Double,
        nota2: Double,
        nota3: Double
    ): Double {
        return (nota1 + nota2 + nota3) / 3
    }
    println(descobrirMedia(10.0, 9.3, 8.5))
}