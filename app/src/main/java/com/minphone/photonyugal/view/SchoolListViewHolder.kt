package com.minphone.photonyugal.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.minphone.photonyugal.R
import com.minphone.photonyugal.view.model.SchoolUI

class SchoolListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: SchoolUI) {
        val tvSchoolName = itemView.findViewById<TextView>(R.id.tvSchoolName)
        val tvLocation = itemView.findViewById<TextView>(R.id.tvLocation)
        val ivPhone = itemView.findViewById<ImageView>(R.id.ivPhone)
        val ivMap = itemView.findViewById<ImageView>(R.id.ivMap)
        val ivWebsite = itemView.findViewById<ImageView>(R.id.ivWebsite)

        tvSchoolName.text = item.school_name
        tvLocation.text = item.location

        ivPhone.setOnClickListener {

        }

        ivMap.setOnClickListener {

        }

        ivWebsite.setOnClickListener {

        }

        itemView.setOnClickListener {

        }
    }
}