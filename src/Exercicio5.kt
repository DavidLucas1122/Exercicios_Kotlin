fun main () {
    var numeros = arrayOf(1,2,3,4,10)
    var result = 0
     for (numero in numeros) {
         result += numero
    }
    println("A soma de todos os valores é: $result")
}