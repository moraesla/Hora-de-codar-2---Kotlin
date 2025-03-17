fun main (){

 //Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

    println("Informe o primeiro valor: ")
    var v1 = readln().toInt()

    println("Informe o segundo valor: ")
    var v2 = readln(). toInt()

    println("Informe o terceiro valor: ")
    var v3 = readln(). toInt()

    var somaMaiores = 0

    if (v1 > v2 && v1 > v3) {
        if (v2 > v3) {
            somaMaiores = v1 + v2
        } else {
            somaMaiores = v1 + v3
        }
    } else if (v2 > v1 && v2 > v3) {
        if (v1 > v3) {
            somaMaiores = v2 + v1
        } else {
            somaMaiores = v2 + v3
        }
    } else {
        if (v1 > v2) {
            somaMaiores = v3 + v1
        } else {
            somaMaiores = v3 + v2
        }
    }

    println("A soma dos dois maiores valores é: $somaMaiores")
}

