package com.example.myapplication

import android.util.Log
import java.util.*

class IRepairShopImpl(val testStrategy : ITestStrategy) : IRepairShop {
    val TAG = javaClass.simpleName
    override val vehicles: ArrayList<IVehicle> = arrayListOf()



    override fun addVehicle(vehicle: IVehicle) {
        vehicles.add(vehicle)
    }

    override fun testNextVehicle() {
        vehicles.get(0)?.let {
            if (testStrategy.test(it)) {
                println("vehicle $it passed the test")
                vehicles.remove(it)
            }
            else {
                vehicles.remove(it)
                vehicles.add(it)
                println("vehicle $it failed the test")
            }
        }
    }

    override fun removeNextVehicle() {
        vehicles.removeAt(0)
    }
}