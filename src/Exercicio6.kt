fun main () {
    var numeros = arrayOf(-3, -2, -1)
    var result = numeros[0]
    for (numero in numeros) {
        if (numero > result) {
            result = numero
        }
    }
    println("O maior número do Array é: $result")
}