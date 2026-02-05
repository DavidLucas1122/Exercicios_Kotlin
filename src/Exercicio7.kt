fun main () {
    var numero = -100

    println("Contagem Regressiva:")

    if (numero > 0) {
        for (i in numero downTo 0) {

            println(i)
        }
    } else  {
        for (i in numero .. 0) {

            println(i)
        }
    }

}