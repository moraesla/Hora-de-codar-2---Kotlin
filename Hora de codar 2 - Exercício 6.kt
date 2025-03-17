fun main(){

    println("Informe o primeiro valor: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor: ")
    val valor2 = readln().toInt()

    println("Informe o terceiro valor: ")
    val valor3 = readln().toInt()

    print("Informe o quarto valor: ")
    val valor4 = readln().toInt()

    var maior = valor1

    if (valor2 > maior) {
        maior = valor2
    }
    if (valor3 > maior) {
        maior = valor3
    }
    if (valor4 > maior) {
        maior = valor4
    }

    println("O primeiro número é o: $valor1")
    println("O último número é o: $valor4")
    println("O maior número deles é: $maior")
}