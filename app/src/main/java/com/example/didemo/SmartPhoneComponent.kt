package com.example.didemo

import dagger.Component


@Component
interface SmartPhoneComponent {
    fun getSmartphone() : SmartPhone
}