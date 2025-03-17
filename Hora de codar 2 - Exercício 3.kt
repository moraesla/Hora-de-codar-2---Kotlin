fun main(){


    var valor1 = 0
    var valor2 = 0
    var valor3 = 0


    println("Informe o primeiro valor: ")
    valor1 = readln().toInt()

    println("Informe o segundo valor: ")
    valor2 = readln().toInt()

    println("Informe o terceiro valor: ")
    valor3 = readln().toInt()

    if(valor1 > valor2 && valor1 > valor3){
        println("O primeiro valor é maior que o segundo e o terceiro")
    }
    else if(valor2 > valor1 && valor2 > valor3){
        println("O segundo valor é maior que o primeiro e o terceiro")
    }
    else{
        println("O terceiro valor é maior que o primeiro e o segundo")
    }

}