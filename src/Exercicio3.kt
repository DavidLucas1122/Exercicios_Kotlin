fun main () {
    val idade = 12

    if (idade < 0){
        println("Idade Inválida")
    } else if (idade < 13) {
        println("Criança")
    } else if (idade <= 17) {
        println("Adolescente")
    } else if (idade <= 59) {
        println("Adulto")
    } else {
        println("Idoso")
    }

    when {
        idade in 0 .. 12 -> println("Criança")
        idade in 13 .. 17 -> println("Adolescente")
        idade in 18 .. 59 -> println("Adulto")
        idade > 59 -> println("Idoso")
        else -> if (idade > 59) println("idoso") else println("Idade Inválida")
    }
}