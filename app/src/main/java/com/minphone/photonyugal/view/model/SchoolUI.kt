package com.minphone.photonyugal.view.model

data class SchoolUI(
    val dbn: String,
    val school_name: String,
    val overview_paragraph: String,
    val location: String,
    val phone_number: String,
    val school_email: String,
    val website: String,
    val total_students: String,
    val school_sports: List<String>,
    val latitude: String,
    val longitude: String
)
