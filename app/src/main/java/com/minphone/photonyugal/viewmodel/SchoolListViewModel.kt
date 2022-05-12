package com.minphone.photonyugal.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minphone.photonyugal.api.SchoolAPI
import com.minphone.photonyugal.api.SchoolRepository
import com.minphone.photonyugal.api.SchoolService
import com.minphone.photonyugal.model.School
import com.minphone.photonyugal.view.mapper.SchoolMapper
import com.minphone.photonyugal.view.model.SchoolUI
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class SchoolListViewModel :
    ViewModel() {

    val schools = MutableLiveData<List<SchoolUI>>()
    val retrofit = Retrofit.Builder().baseUrl("https://data.cityofnewyork.us/resource/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
    val repository: SchoolRepository = SchoolService(retrofit.build().create(SchoolAPI::class.java))

    fun getSchool() {
        repository.getSchoolList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<List<School>> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(values: List<School>) {
                    schools.postValue(values.map { SchoolMapper.map.invoke(it) })
                }

                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }
            })
    }

}