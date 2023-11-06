//Определение большего числа

fun main(){

    println("Привет! Я помогу тебе сравнить числа и подсказать, какое больше.")

    println("Введите число 1: ")
    val firstNumber = readLine()!!.toInt()
    println("Введите число 2: ")
    val secondNumber = readLine()!!.toInt()

    if(firstNumber > secondNumber){
        println("Первое число больше второго ($firstNumber)")
    } else if(secondNumber > firstNumber){
        println("Второе число больше первого ($secondNumber)")
    } else{
        println("Числа равны")
    }
}