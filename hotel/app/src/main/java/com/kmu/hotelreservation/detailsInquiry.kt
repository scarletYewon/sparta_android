package com.kmu.hotelreservation

fun detailsInquiry(reservationList: ArrayList<Customer>) {

    println("조회하실 사용자 이름을 입력하세요")
    val name = readLine()

    val cnt = reservationList.count()!!.toInt()
    for(i:Int in 0 until cnt)
        if (reservationList[i].name == name){
            println("1. 초기 금액으로 ${reservationList[i].deposit} 원 입금되었습니다.\n2. 예약금으로 ${reservationList[i].withdraw} 원 출금되었습니다.")
            showMenu(reservationList)
        }

    println("예약된 사용자를 찾을 수 없습니다.")
    showMenu(reservationList)

}