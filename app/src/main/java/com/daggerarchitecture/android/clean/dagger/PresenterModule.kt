package com.daggerarchitecture.android.clean.dagger

import com.daggerarchitecture.android.clean.network.Homepage
import com.daggerarchitecture.android.clean.network.Wiki
import com.daggerarchitecture.android.clean.ui.homepage.HomepagePresenter
import com.daggerarchitecture.android.clean.ui.homepage.HomepagePresenterImpl
import com.daggerarchitecture.android.clean.ui.search.EntryPresenter
import com.daggerarchitecture.android.clean.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides

@Module
object PresenterModule {
    @JvmStatic
    @Provides
    fun provideHomepagePresenter(homepage: Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

    @JvmStatic
    @Provides
    fun provideEntryPresenter(wiki: Wiki): EntryPresenter = EntryPresenterImpl(wiki)
}