package com.kmu.hotelreservation

data class Customer(
    val name : String,
    val roomNum : Int,
    val checkInDate : Int,
    val checkOutDate : Int,
    val deposit : Int,
    val withdraw: Int,
)