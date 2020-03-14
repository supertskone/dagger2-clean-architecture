package com.daggerarchitecture.android.clean.dagger

import com.daggerarchitecture.android.clean.network.WikiApi
import com.daggerarchitecture.android.clean.utils.Const
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

@Module
object NetworkModule {
    private const val NAME_BASE_URL = "NAME_BASE_URL"

    @JvmStatic
    @Provides
    @Named(NAME_BASE_URL)
    fun provideBaseUrlString() = "${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}"

    @JvmStatic
    @Provides
    @Singleton
    fun provideHttpClient() = OkHttpClient()

    @JvmStatic
    @Provides
    @Singleton
    fun provideRequestBuilder(@Named(NAME_BASE_URL) baseUrl: String) =
            HttpUrl.parse(baseUrl)?.newBuilder()

    @JvmStatic
    @Provides
    @Singleton
    fun provideWikiApi(client: OkHttpClient, requestBuilder: HttpUrl.Builder?) =
            WikiApi(client, requestBuilder)
}