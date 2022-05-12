package com.minphone.photonyugal.view.mapper

import com.minphone.photonyugal.model.School
import org.junit.Assert
import org.junit.Test

class SchoolMapperTest {

    @Test
    fun schoolModelNormalTest() {
        val school = School(
            "02M260",
            "Clinton School Writers & Artists, M.S. 260",
            "Students who are prepared for college must have an education that encourages them to take risks as they produce and perform. Our college preparatory curriculum develops writers and has built a tight-knit community. Our school develops students who can think analytically and write creatively. Our arts programming builds on our 25 years of experience in visual, performing arts and music on a middle school level. We partner with New Audience and the Whitney Museum as cultural partners. We are a International Baccalaureate (IB) candidate school that offers opportunities to take college courses at neighboring universities.",
            "10 East 15th Street, Manhattan NY 10003 (40.736526, -73.992727)",
            "212-524-4360",
            "admissions@theclintonschool.net",
            "www.theclintonschool.net",
            "376",
            "Cross Country, Track and Field, Soccer, Flag Football, Basketball",
            "40.73653",
            "-73.9927",
        )
        val schoolUIModel = SchoolMapper.map.invoke(school)
        Assert.assertEquals(
            listOf(
                "Cross Country",
                "Track and Field",
                "Soccer",
                "Flag Football",
                "Basketball"
            ), schoolUIModel.school_sports
        )
    }

    @Test
    fun schoolModelNullTest() {
        val school = School(
            null, null, null, null,
            null, null, null, null, null,
            null, null
        )
        val schoolUIModel = SchoolMapper.map.invoke(school)
        Assert.assertEquals(listOf<String>(), schoolUIModel.school_sports)
    }

}