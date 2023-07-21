package com.kmu.hotelreservation

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun reserveFlow(reservationList: ArrayList<Customer>) {

    println("예약자분의 성함을 입력해주세요")
    val name = readLine()!!.toString()

    println("예약할 방번호를 입력해주세요")
    var roomNum = readLine()!!.toInt()
    while (roomNum<100 || roomNum>999){
        println("올바르지 않은 방번호 입니다. 방번호는 100~999 영역 이내입니다.")
        println("예약할 방번호를 입력해주세요")
        roomNum = readLine()!!.toInt()
    }

    println("체크인 날짜를 입력해주세요 표기형식. 20230631")
    val todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")).toInt()
    var checkInDate = readLine()!!.toInt()
    while (checkInDate<todayDate){
        println("체크인은 지난날은 선택할 수 없습니다.")
        println("체크인 날짜를 다시 입력해주세요 표기형식. 20230631")
        checkInDate = readLine()!!.toInt()
    }

    println("체크아웃 날짜를 입력해주세요 표기형식. 20230631")
    var checkOutDate = readLine()!!.toInt()
    while (checkInDate>=checkOutDate){
        println("체크인 날짜보다 이전이거나 같을 수는 없습니다.")
        println("체크아웃 날짜를 다시 입력해주세요 표기형식. 20230631")
        checkOutDate = readLine()!!.toInt()
    }

    println("호텔 예약이 완료되었습니다.")

    val depositRange = (100000..200000)
    val withdrawRange = (50000..100000)

    val deposit = depositRange.random()
    val withdraw = withdrawRange.random()

    val reservation = Customer(name, roomNum, checkInDate, checkOutDate, deposit, withdraw)
    reservationList.add(reservation)
    showMenu(reservationList)
}