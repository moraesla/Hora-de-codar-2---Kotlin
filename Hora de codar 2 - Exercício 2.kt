fun main(){

    println("Informe um valor: ")
    var valor = readln().toInt()

    if(valor > 0){
        println("O valor informado é positivo")
    }
    else if(valor < 0){
        println("O valor informado é negativo")
    }
    else{
        println("O valor informado é zero")
    }
}