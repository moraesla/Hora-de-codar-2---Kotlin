fun main() {

    var contador = 1
    var ordem = 1
    val numeros = mutableListOf<Int>()

    while (contador <= 6) {
        println("Informe o $ordem número: ")
        val numero = readln().toIntOrNull()
        if (numero != null && numero > 0 && numero < 10) {
            numeros.add(numero)
            contador = contador + 1
            ordem = ordem + 1
        }
        else {
            println("Digite um número entre 1 e 9.")
        }
    }

    val media = numeros.sum() / numeros.size

    if(media > 5){
        println("Você passou no teste!!")
    }
    else{
        println("Tente novamente")
    }

}