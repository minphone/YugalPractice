package com.minphone.photonyugal.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.minphone.photonyugal.R
import com.minphone.photonyugal.viewmodel.SchoolListViewModel

class MainFragment : Fragment() {

    private lateinit var viewModel: SchoolListViewModel

    private val adapter = SchoolListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvSchoolList = view.findViewById<RecyclerView>(R.id.rvSchool)
        rvSchoolList.adapter = adapter
        rvSchoolList.layoutManager = LinearLayoutManager(requireContext())


        viewModel = ViewModelProvider(this)[SchoolListViewModel::class.java]
        viewModel.schools.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.getSchool()
    }
}