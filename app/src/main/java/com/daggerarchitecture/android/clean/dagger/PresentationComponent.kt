package com.daggerarchitecture.android.clean.dagger

import com.daggerarchitecture.android.clean.ui.homepage.HomepageActivity
import com.daggerarchitecture.android.clean.ui.search.SearchActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [PresenterModule::class, WikiModule::class])
interface PresentationComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): PresentationComponent
        @BindsInstance
        fun activity(fragmentActivity: BaseActivity): Builder
    }

    fun inject(target: HomepageActivity)
    fun inject(target: SearchActivity)
}