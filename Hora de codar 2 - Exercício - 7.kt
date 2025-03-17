fun main() {

    var contador = 1
    var ordem = 1
    var soma = 0
    val numeros = mutableListOf<Int>()

    while (contador <= 6) {
        println("Informe o $ordem número: ")
        val numero = readln().toInt()
        numeros.add(numero)
        if(numero < 72){
        soma = soma + numero}
        contador = contador + 1
        ordem = ordem + 1

    }
    println("Os números informadados foram: $numeros ")

    println("O resultado da soma entre os números menores que 72 é: $soma")

}