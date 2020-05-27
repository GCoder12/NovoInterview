package com.example.myapplication

import java.util.*

interface IVehicle {

    val numberOfDoors : Int
    val ID : UUID

    fun accelerate() : Boolean
    fun brake() : Boolean
}