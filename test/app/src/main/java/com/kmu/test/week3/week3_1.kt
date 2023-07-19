package com.kmu.test.week3

//- 두 개의 숫자를 더하는 메소드를 만들고, 전달하는 숫자에 따라 덧셈결과를 알려줘요
//- sum메소드는 매개변수로 num1과 num2를 요구해요
//- 필수로 매개변수를 넣어줘야 호출할 수 있어요

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    // sum이라는 이름의 메소드를 호출!
    sum(num1, num2)
}

fun sum(num1:Int, num2:Int) {
    var result = num1 + num2
    println("num1과 num2의 덧셈결과는 ${result}입니다.")
}