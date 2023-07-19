package com.kmu.test

//레벨4

abstract class AbstractOperation {
    abstract fun operate(num1:Int, num2: Int):Double
}

class Calculator() {
    fun operate(operator:AbstractOperation,num1: Int, num2: Int): Double {
        return operator.operate(num1,num2)
    }
}

class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}
class SubOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}
class MulOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}
class DivOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 / num2).toDouble()
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
            println(calc.operate(AddOperation(),num1,num2))
        }
        "-" -> {
            println("답:")
            println(calc.operate(SubOperation(),num1,num2))
        }
        "*" -> {
            println("답:")
            println(calc.operate(MulOperation(),num1,num2))
        }
        "/" -> {
            println("답:")
            println(calc.operate(DivOperation(),num1,num2))
        }
        else -> {
            println("잘못입력함")
        }
    }
}
