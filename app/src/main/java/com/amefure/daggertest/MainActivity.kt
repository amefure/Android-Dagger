package com.amefure.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = DaggerAppComponent.create()
        val user = appComponent.getUser()
        user.playGame()
        println("残りのスタミナ: ${user.stamina}")
    }
}