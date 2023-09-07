package com.amefure.daggertest.DI

import javax.inject.Inject

class User @Inject constructor(
    private val actionGame: ActionGame

) {
    var stamina: Int = 20

    fun playGame() {
        if (actionGame.requiredStamina <= stamina) {
            println("Playing")
            stamina -= actionGame.requiredStamina
        } else {
            println("Out of Stamina...")
        }
    }
}


