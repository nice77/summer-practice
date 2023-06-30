package com.example.task01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task01.databinding.FragmentNewsBinding
import com.example.task01.databinding.FragmentSettingsBinding
import com.example.task01.databinding.FragmentStatsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
        binding?.run {
            btn.setOnClickListener {
                findNavController().navigate(R.id.action_settingsFragment_to_statsFragment,
                createBundle())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object {
        fun createBundle(): Bundle {
            val bundle = Bundle()
            bundle.putString("NAME", "SettingsFragment")
            return bundle
        }
    }
}