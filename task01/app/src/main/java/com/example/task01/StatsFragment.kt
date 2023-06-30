package com.example.task01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task01.databinding.FragmentStatsBinding
import com.google.android.material.snackbar.Snackbar

class StatsFragment : Fragment(R.layout.fragment_stats) {
    private var binding: FragmentStatsBinding ?= null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStatsBinding.bind(view)
        binding?.run {
            Snackbar.make(root, arguments?.getString("NAME") as CharSequence, Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}