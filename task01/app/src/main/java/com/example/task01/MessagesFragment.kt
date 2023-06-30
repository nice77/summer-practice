package com.example.task01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task01.databinding.FragmentMessagesBinding
import com.example.task01.databinding.FragmentNewsBinding

class MessagesFragment : Fragment(R.layout.fragment_messages) {

    private var binding: FragmentMessagesBinding ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessagesBinding.bind(view)

        binding?.run {
            btn.setOnClickListener {
                findNavController().navigate(
                    R.id.action_messagesFragment_to_statsFragment,
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
            bundle.putString("NAME", "MessagesFragment")
            return bundle
        }
    }
}