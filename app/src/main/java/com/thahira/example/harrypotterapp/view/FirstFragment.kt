package com.thahira.example.harrypotterapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thahira.example.harrypotterapp.databinding.FragmentFirstBinding
import com.thahira.example.harrypotterapp.utils.FragmentSwitcher


class FirstFragment() : Fragment() {

   private val binding: FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
   }

    private val fragmentSwitcher: FragmentSwitcher = FragmentSwitcher()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.staffButton.setOnClickListener(){
            fragmentSwitcher.switchFragment(parentFragmentManager,DetailFragment.newInstance())
        }

        binding.studentButton.setOnClickListener(){
            fragmentSwitcher.switchFragment(parentFragmentManager,StudentFragment.newInstance())
        }

        return binding.root
    }

    companion object {
        //for checking if the character is a staff or student
        var staff: Boolean = true
        @JvmStatic
        fun newInstance() = FirstFragment()

    }
}