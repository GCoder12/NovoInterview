package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var repairShop : IRepairShop

    @Before
    fun setup() {
        val testStrategy = ITestStrategyImpl()
        repairShop = IRepairShopImpl(testStrategy)
        for ( i in 0..9) {
            val vehicle = IVehicleImpl(i % 4, UUID.randomUUID())
            repairShop.addVehicle(vehicle)
        }

    }

    @Test
    fun testVehicles() {
        while (repairShop.vehicles.isNotEmpty()) {
            repairShop.testNextVehicle()
        }
    }


}
