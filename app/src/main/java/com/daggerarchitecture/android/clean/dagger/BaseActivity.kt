package com.daggerarchitecture.android.clean.dagger

import android.app.Activity
import com.daggerarchitecture.android.clean.application.WikiApplication

abstract class BaseActivity : Activity() {
    private var mIsInjectorUser = false

    protected fun getPresentationComponent(): PresentationComponent {
        if (mIsInjectorUser)
            throw RuntimeException("There is no need to use injector more than once")

        return WikiApplication[application]
                .presentationComponentBuilder()
                .activity(this)
                .build()
    }
}