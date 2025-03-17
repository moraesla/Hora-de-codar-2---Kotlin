fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    println("Escolha a operação:")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
    print("Digite o código da operação (1, 2, 3 ou 4): ")
    val operacao = readLine()!!.toInt()

    when (operacao) {
        1 -> println("Resultado da adição: ${valor1 + valor2}")
        2 -> println("Resultado da subtração: ${valor1 - valor2}")
        3 -> {
            if (valor2 != 0) {
                println("Resultado da divisão: ${valor1 / valor2}")
            } else {
                println("Erro: Divisão por zero não permitida.")
            }
        }
        4 -> println("Resultado da multiplicação: ${valor1 * valor2}")
        else -> println("Operação inválida! Digite um valor entre 1 e 4.")
    }
}