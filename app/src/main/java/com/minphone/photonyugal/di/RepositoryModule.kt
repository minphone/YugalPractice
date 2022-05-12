package com.minphone.photonyugal.di

import com.minphone.photonyugal.api.SchoolAPI
import com.minphone.photonyugal.api.SchoolRepository
import com.minphone.photonyugal.api.SchoolService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(api: SchoolAPI): SchoolRepository = SchoolService(api)

}