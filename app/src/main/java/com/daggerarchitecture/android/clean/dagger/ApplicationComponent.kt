package com.daggerarchitecture.android.clean.dagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Application): Builder

        fun build(): ApplicationComponent
    }

    //new
    fun presentationComponentBuilder(): PresentationComponent.Builder
}
