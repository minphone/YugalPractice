package com.minphone.photonyugal.api

import com.minphone.photonyugal.model.School
import com.minphone.photonyugal.model.SchoolDetail
import io.reactivex.Observable

interface SchoolRepository {

    fun getSchoolList(): Observable<List<School>>

    fun getSchoolDetail(dbn: String): Observable<List<SchoolDetail>>

}