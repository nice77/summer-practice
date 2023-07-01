package com.example.task02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.task02.databinding.FragmentUsersBinding

class UsersFragment : Fragment(R.layout.fragment_users) {
    private var binding: FragmentUsersBinding ?= null
    private var adapter: UserAdapter ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentUsersBinding.bind(view)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = UserAdapter(
            UserRepository.list,
            { user -> findNavController().navigate(R.id.action_usersFragment_to_userPageFragment, createBundle(user.id))},
        )
        binding?.rvUsers?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object {
        fun createBundle(id : Int) : Bundle {
            val bundle = Bundle()
            bundle.putInt("id", id)
            return bundle
        }
    }
}
