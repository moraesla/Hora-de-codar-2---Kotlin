fun main(){

    var contador = 1
    var ordem = 1
    var soma = 0
    val numeros = mutableListOf<Int>()

    while(contador <= 6){
        println("Informe o $ordem número: ")
        val numero = readln().toInt()
        numeros.add(numero)
        soma = soma + numero
        contador = contador + 1
        ordem = ordem + 1

    }
    println("Os números informadados foram: $numeros ")

    var mediaA = soma / 6

    println("O resultado da média Aritmética é: $mediaA")

}