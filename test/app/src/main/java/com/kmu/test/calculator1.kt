package com.kmu.test

fun main() {
    val calc = Calculator()
    println("연산자를 입력하세요(+,-,*,/,% 5개 중에서만 입력)")
    var operator = readLine()
    println("1번 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()
    println("2번 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()
    when(operator) {
        "+" -> {
            println("답:")
            println(calc.addNum(num1,num2))
        }
        "-" -> {
            println("답:")
            println(calc.subNum(num1,num2))
        }
        "*" -> {
            println("답:")
            println(calc.multNum(num1,num2))
        }
        "/" -> {
            println("답:")
            println(calc.divNum(num1,num2))
        }
        "%" -> {
            println("답:")
            println(calc.modNum(num1,num2))
        }
        else -> {
            println("잘못입력함")
        }
    }
}

class Calculator {

    fun addNum(num1: Int, num2: Int): Int {
        return num1+num2
    }

    fun subNum(num1: Int, num2: Int): Int {
        return num1-num2
    }

    fun multNum(num1: Int, num2: Int): Int {
        return num1*num2
    }

    fun divNum(num1: Int, num2: Int): Int {
        return num1/num2
    }

    fun modNum(num1: Int, num2: Int): Int {
        return num1%num2
    }

}