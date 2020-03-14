package com.daggerarchitecture.android.clean.dagger

import com.daggerarchitecture.android.clean.network.Homepage
import com.daggerarchitecture.android.clean.network.Wiki
import com.daggerarchitecture.android.clean.network.WikiApi
import dagger.Module
import dagger.Provides

@Module
object WikiModule {
    @JvmStatic
    @Provides
    fun provideHomepage(api: WikiApi) = Homepage(api)

    @JvmStatic
    @Provides
    fun provideWiki(api: WikiApi) = Wiki(api)
}