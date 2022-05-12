package com.minphone.photonyugal.di

import com.minphone.photonyugal.api.SchoolAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder {
        return Retrofit.Builder().baseUrl("https://data.cityofnewyork.us/resource/")
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Provides
    @Singleton
    fun provideSchoolAPI(retrofit: Retrofit.Builder): SchoolAPI {
        return retrofit.build().create(SchoolAPI::class.java)
    }

}