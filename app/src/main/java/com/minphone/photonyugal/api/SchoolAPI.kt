package com.minphone.photonyugal.api

import com.minphone.photonyugal.model.School
import com.minphone.photonyugal.model.SchoolDetail
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SchoolAPI {

    @GET("s3k6-pzi2.json")
    fun getSchoolList(): Observable<List<School>>

    @GET("f9bf-2cp4.json")
    fun getSchoolDetail(@Query("dbn") dbn: String): Observable<List<SchoolDetail>>

}