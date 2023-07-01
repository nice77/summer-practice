package com.example.task01

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task01.databinding.FragmentNewsBinding
import com.google.android.material.snackbar.Snackbar

class NewsFragment : Fragment(R.layout.fragment_news) {

    private var binding : FragmentNewsBinding ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewsBinding.bind(view)
        binding?.run {
            btn.setOnClickListener {
                findNavController().navigate(
                    R.id.action_newsFragment_to_statsFragment,
                    createBundle()
                )
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
            bundle.putString("NAME", "NewsFragment")
            return bundle
        }
    }
}