fun main(){

    println("Informe o ano de nascimento: ")
    var ano_nascimento = readln().toInt()

    var ano_atual = 2024

    var idade = (ano_atual - ano_nascimento)

    if(idade > 16){
        println("Você já apto a votar")
    }
    else{
        println("No momento, você não está apto a votar.")
    }
}