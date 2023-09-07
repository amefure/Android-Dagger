package com.amefure.daggertest.DI

import dagger.Module
import dagger.Provides

@Module
class GameModule {
    @Provides
    fun provideActionGame(): ActionGame {
        return ActionGame()
    }
}