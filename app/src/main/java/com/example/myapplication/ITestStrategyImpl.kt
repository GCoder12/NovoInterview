package com.example.myapplication

class ITestStrategyImpl : ITestStrategy {
    override fun test(vehicle: IVehicle) : Boolean {
        if (vehicle.accelerate() && vehicle.brake())
            return true
        return false
    }


}