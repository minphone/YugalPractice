package com.minphone.photonyugal.api

import com.minphone.photonyugal.model.School
import com.minphone.photonyugal.model.SchoolDetail
import io.reactivex.Observable
import javax.inject.Inject

class SchoolService constructor(val schoolAPI: SchoolAPI) : SchoolRepository {

    override fun getSchoolList(): Observable<List<School>> {
        return schoolAPI.getSchoolList()
    }

    override fun getSchoolDetail(dbn: String): Observable<List<SchoolDetail>> {
        return schoolAPI.getSchoolDetail(dbn)
    }
}