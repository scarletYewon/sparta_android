package com.kmu.test

//레벨3

class Calculator {
    fun addOperation(operator:AddOperation,num1: Int,num2: Int): Double {
        return operator.operate(num1,num2)
    }
    fun subOperation(operator:SubOperation,num1: Int,num2: Int): Double {
        return operator.operate(num1,num2)
    }
    fun mulOperation(operator:MulOperation,num1: Int,num2: Int): Double {
        return operator.operate(num1,num2)
    }
    fun divOperation(operator:DivOperation,num1: Int,num2: Int): Double {
        return operator.operate(num1,num2)
    }
}


class AddOperation{
    fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}
class SubOperation{
    fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}
class MulOperation{
    fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}
class DivOperation{
    fun operate(num1: Int, num2: Int): Double = (num1 / num2).toDouble()
}


fun main() {
    val calc = Calculator()
    println("연산자를 입력하세요(+,-,*,/ 4개 중에서만 입력)")
    var operator = readLine()
    println("1번 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()
    println("2번 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()
    when(operator) {
        "+" -> {
            println("답:")
            println(calc.addOperation(AddOperation(),num1,num2))
        }
        "-" -> {
            println("답:")
            println(calc.subOperation(SubOperation(),num1,num2))
        }
        "*" -> {
            println("답:")
            println(calc.mulOperation(MulOperation(),num1,num2))
        }
        "/" -> {
            println("답:")
            println(calc.divOperation(DivOperation(),num1,num2))
        }
        else -> {
            println("잘못입력함")
        }
    }
}
