package com.example.myapplication

import android.util.Log
import java.util.*

class IVehicleImpl(override val numberOfDoors: Int, override val ID: UUID) : IVehicle {


    val TAG = javaClass.simpleName
    override fun accelerate() : Boolean {

        println("accerlating ID:${ID.toString()}")
        return Math.random() > .5
    }

    override fun brake() : Boolean {
        println("Braking ID:$ID")
        return Math.random() > .5
    }
}