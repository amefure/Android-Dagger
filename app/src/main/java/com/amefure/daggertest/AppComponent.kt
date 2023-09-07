package com.amefure.daggertest

import com.amefure.daggertest.DI.GameModule
import com.amefure.daggertest.DI.User
import dagger.Component

@Component(modules = [GameModule::class])
interface AppComponent {
    fun getUser(): User
}