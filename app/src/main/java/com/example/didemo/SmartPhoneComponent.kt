package com.example.didemo

import dagger.Component


@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartphone() : SmartPhone
}