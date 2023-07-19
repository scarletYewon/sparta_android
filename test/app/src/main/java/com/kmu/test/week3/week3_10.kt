package com.kmu.test.week3

// 오버로딩

fun main() {
    var calc = Calculator()

    var intResult = calc.add(1,2)
    var doubleResult = calc.add(1.2, 2.2)

    println("정수 덧셈결과: ${intResult}")
    println("실수 덧셈결과: ${doubleResult}")

}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        return num1+num2
    }

    fun add(num1: Double, num2: Double): Double {
        return num1+num2
    }
}