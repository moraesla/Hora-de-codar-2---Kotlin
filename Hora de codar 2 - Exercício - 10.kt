fun main(){

    println("Informe o seu gênero (M para masculino, F para feminino): ")
    var genero = readln()

    println("Informe sua altura: ")
    var altura = readln().toFloat()

    if(genero == "F"){
        var peso_ideal = (72.7 * altura) - 58
        println("Seu peso ideal é: $peso_ideal")
    }
    else if(genero == "M"){
        var peso_ideal = (62.1 * altura) - 44.7
        println("Seu peso ideal é: $peso_ideal")
    }


}