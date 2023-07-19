package com.kmu.test.week3

// 오버라이딩

fun main() {
    var bird = Bird2("새")
    var chicken = Chicken2("닭", 2)
    var sparrow = Sparrow2("참새", "갈색")
    var pigeon = Pigeon2("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird2(name:String) {
    var name: String = ""

    init {
        // this는 현재 클래스의 상태변수를 의미합니다
        // var name: String = ""
        this.name = name
    }

    open fun fly() {
        println("${name}은 날아요~")
    }

}

class Chicken2(name: String, age: Int) : Bird2(name) {
    var age:Int = 0

    init {
        this.age = age
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${age}살의 ${name}가 날아봅니다~ 꼬끼오!")
    }
}

class Sparrow2(name: String, color: String) : Bird2(name) {
    var color:String = ""

    init {
        this.color = color
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon2(name: String, address: String) : Bird2(name) {
    var address: String = ""

    init {
        this.address = address
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${address} 살고있는 ${name}가 날아봅니다~ 구구!")
    }
}