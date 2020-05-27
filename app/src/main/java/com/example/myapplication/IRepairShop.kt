package com.example.myapplication

import java.util.*
import kotlin.collections.ArrayList

interface IRepairShop {

    val vehicles : ArrayList<IVehicle>

    fun addVehicle(vehicle : IVehicle)
    fun testNextVehicle()
    fun removeNextVehicle()

}