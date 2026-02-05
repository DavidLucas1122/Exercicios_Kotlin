fun main() {
    var numeros = arrayOf(1,2,20,4,10)
    var pares: Array<Int> = arrayOf()

    for (numero in numeros) {
        if (numero % 2 == 0) {
            pares += numero
        }
    }
    var result = 0

    for (numero in pares) {
        result += numero
    }

    println("O Resultado da soma dos números PARES é $result")
}