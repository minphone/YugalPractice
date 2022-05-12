package com.minphone.photonyugal.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.minphone.photonyugal.R
import com.minphone.photonyugal.view.model.SchoolUI

class SchoolListAdapter : ListAdapter<SchoolUI, SchoolListViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolListViewHolder {
        return SchoolListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_school, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SchoolListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object diffCallback : DiffUtil.ItemCallback<SchoolUI>() {
        override fun areItemsTheSame(oldItem: SchoolUI, newItem: SchoolUI): Boolean {
            return oldItem.dbn == newItem.dbn
        }

        override fun areContentsTheSame(oldItem: SchoolUI, newItem: SchoolUI): Boolean {
            return oldItem.dbn == newItem.dbn
        }
    }
}