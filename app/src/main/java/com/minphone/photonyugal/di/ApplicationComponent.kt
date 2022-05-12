package com.minphone.photonyugal.di

import android.content.Context
import com.minphone.photonyugal.view.MainActivity
import com.minphone.photonyugal.view.MainFragment
import dagger.BindsInstance
import dagger.Component

@Component(modules = [NetworkModule::class, RepositoryModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun injectActivity(activity: MainActivity)

}