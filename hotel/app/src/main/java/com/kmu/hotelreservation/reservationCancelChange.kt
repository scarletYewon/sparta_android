package com.kmu.hotelreservation

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun reservationCancelChange(reservationList: ArrayList<Customer>) {

    var userList = ArrayList<Customer>()
    val allListCnt = reservationList.count()

    println("예약을 변경할 사용자 이름을 입력하세요")
    val name = readLine()!!

    for (i: Int in 0 until allListCnt)
        if (reservationList[i].name == name) {
            userList.add(reservationList[i])
        }

    if (userList.isEmpty()) {
        println("예약된 사용자를 찾을 수 없습니다.")
        showMenu(reservationList)
    } else {
        findReservation(reservationList, userList, name)
    }

}

fun findReservation(
    reservationList: ArrayList<Customer>,
    userList: ArrayList<Customer>,
    name: String
) {
    val userListCnt = userList.count()
    println("${name} 님이 예약한 목록입니다. 변경하실 예약번호를 입력해주세요 (탈출은 exit입력)")

    for (i: Int in 0 until userListCnt)
        println("${i + 1}. 사용자: ${userList[i].name}, 방번호: ${userList[i].roomNum}, 체크인: ${userList[i].checkInDate}, 체크아웃: ${userList[i].checkOutDate}")

    var changeReservationNum = readLine()
    if (changeReservationNum == "exit") {
        showMenu(reservationList)
    } else if (changeReservationNum!!.toInt() > 0 && changeReservationNum!!.toInt() <= userListCnt) {
        println("해당 예약을 어떻게 하시겠어요 1. 변경 2. 취소 / 이외 번호. 메뉴로 돌아가기")
        val reserveNum = changeReservationNum!!.toInt()
        val howTo = readLine()!!.toInt()
        when (howTo) {
            1 -> {
                reservationChange(reservationList, userList[reserveNum - 1])
            }
            2 -> {
                reservationCancel(reservationList, userList[reserveNum - 1])
            }
            else -> {
                findReservation(reservationList, userList, name)
            }
        }
    } else {
        println("범위에 없는 예약번호 입니다.")
        findReservation(reservationList, userList, name)
    }
}

fun reservationChange(reservationList: ArrayList<Customer>, changeList: Customer) {

    reservationList.remove(changeList)

    println("1. 사용자: ${changeList.name}, 방번호: ${changeList.roomNum}, 체크인: ${changeList.checkInDate}, 체크아웃: ${changeList.checkOutDate}")

    println("변경할 방 번호를 입력하세요")
    val newRoomNum = readLine()!!.toInt()

    println("변경할 체크인 날짜를 입력하세요")
    val todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")).toInt()
    var newCheckInDate = readLine()!!.toInt()
    while (newCheckInDate < todayDate) {
        println("체크인은 지난날은 선택할 수 없습니다.")
        println("체크인 날짜를 다시 입력해주세요 표기형식. 20230631")
        newCheckInDate = readLine()!!.toInt()
    }

    println("변경할 체크아웃 날짜를 입력하세요")
    var newCheckOutDate = readLine()!!.toInt()
    while (newCheckInDate >= newCheckOutDate) {
        println("체크인 날짜보다 이전이거나 같을 수는 없습니다.")
        println("체크아웃 날짜를 다시 입력해주세요 표기형식. 20230631")
        newCheckOutDate = readLine()!!.toInt()
    }


    val newList = Customer(
        changeList.name,
        newRoomNum,
        newCheckInDate,
        newCheckOutDate,
        changeList.deposit,
        changeList.withdraw
    )
    reservationList.add(newList)

    showMenu(reservationList)
}

fun reservationCancel(reservationList: ArrayList<Customer>, cancelList: Customer) {
    reservationList.remove(cancelList)
    print(
        "[취소 유의사항]\n체크인 3일 이전 취소 예약금 환불 불가\n체크인 5일 이전 취소 예약금의 30% 환불\n체크인 7일 이전 취소 예약금의 50% 환불\n체크인 14일 이전 취소 예약금의 80% 환불\n체크인 30일 이전 취소 예약금의 100% 환불\n취소가 완료되었습니다."
    )
    showMenu(reservationList)
}