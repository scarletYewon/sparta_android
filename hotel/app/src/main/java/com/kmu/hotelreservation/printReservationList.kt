package com.kmu.hotelreservation

fun printReservationListSort(reservationList: ArrayList<Customer>){
    reservationList.sortWith(compareBy<Customer>{it.checkInDate})
    printReservationList(reservationList)
}

fun printReservationList(reservationList: ArrayList<Customer>) {
    val cnt = reservationList.count()!!.toInt()
    for(i:Int in 0 until cnt)
        println("${i+1}. 사용자: ${reservationList[i].name}, 방번호: ${reservationList[i].roomNum}, 체크인: ${reservationList[i].checkInDate}, 체크아웃: ${reservationList[i].checkOutDate}")

//    reservationList.forEach{ println("${1 until cnt+1}. 사용자: ${it.name}, 방번호: ${it.roomNum}, 체크인: ${it.checkInDate}, 체크아웃: ${it.checkOutDate}") }
    showMenu(reservationList)
}