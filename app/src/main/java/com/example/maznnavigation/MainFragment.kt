package com.example.maznnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.maznnavigation.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentABtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentA)
        }

        binding.fragmentBBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentB)
        }
    }
}