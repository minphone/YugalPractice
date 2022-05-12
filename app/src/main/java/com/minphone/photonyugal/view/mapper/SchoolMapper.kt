package com.minphone.photonyugal.view.mapper

import com.minphone.photonyugal.model.School
import com.minphone.photonyugal.view.model.SchoolUI

class SchoolMapper {

    companion object {
        val map: ((School) -> (SchoolUI)) = {
            SchoolUI(
                it.dbn ?: "",
                it.school_name ?: "",
                it.overview_paragraph ?: "",
                it.location ?: "",
                it.phone_number ?: "",
                it.school_email ?: "",
                it.website ?: "",
                it.total_students ?: "",
                if (it.school_sports != null) {
                    it.school_sports.split(", ")
                } else emptyList(),
                it.latitude ?: "",
                it.longitude ?: ""
            )
        }
    }

}