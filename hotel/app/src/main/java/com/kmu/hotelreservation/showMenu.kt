package com.kmu.hotelreservation

fun showMenu(reservationList: ArrayList<Customer>) {
    println("호텔예약 프로그램 입니다.")
    println("[메뉴]")
    println("1. 방예약, 2. 예약목록 출력, 3. 예약목록 (정렬) 출력, 4. 시스템 종료, 5. 금액 입금-출금 내역 목록 출력, 6. 예약 변경/취소")
    when(readLine()!!.toInt()){
        1 -> {
            reserveFlow(reservationList)
        }
        2 -> {
            println("호텔 예약자 목록입니다.")
            printReservationList(reservationList)
        }
        3 -> {
            println("호텔 예약자 목록입니다. (정렬완료)")
            printReservationListSort(reservationList)
        }
        4 -> {
            println("이용해주셔서 감사합니다.")
            System.exit(0)
        }
        5 -> {
            detailsInquiry(reservationList)
        }
        6 -> {
            reservationCancelChange(reservationList)
        }
        else -> {
            showMenu(reservationList)
        }
    }
}