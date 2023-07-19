package com.kmu.test.week3

//init 주 생성자의 사용예시

fun main() {

}

// 클래스 선언부에 생성자를 명시함
class Character(_name:String, _hairColor:String, _height:Double) {
    var name:String = ""
    var hairColor:String = ""
    var height:Double = 0.0

    // 매개변수를 직접 넘기지않음
    init {
        println("매개변수없는 생성자 실행 완료!")
    }

    fun fireBall() {
        println("파이어볼!")
    }
    fun compositing(device1:String, device2:String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}