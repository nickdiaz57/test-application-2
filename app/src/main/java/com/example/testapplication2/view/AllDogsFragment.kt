package com.example.testapplication2.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.testapplication2.DogApplication_GeneratedInjector
import com.example.testapplication2.adapter.DogAdapter
import com.example.testapplication2.viewmodel.DogViewModel
import com.example.testapplication2.utils.Resource
import com.example.testapplication2.databinding.FragmentAllDogsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AllDogsFragment: Fragment() {

    private var _binding: FragmentAllDogsBinding? = null
    private val binding: FragmentAllDogsBinding get() = _binding!!
    private val viewModel: DogViewModel by activityViewModels()
    private val dogAdapter by lazy { DogAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAllDogsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvList.adapter = dogAdapter
        Log.e("Fragment", "${viewModel.dogList.value}")

        // TODO: Create layout to handle resource events
//        viewModel.dogList.observe(viewLifecycleOwner) { dogResponse ->
//            when(dogResponse) {
//                is Resource.Loading ->{}
//                is Resource.Success ->{
////                    Log.e("Fragment", "$dogResponse")
//                }
//                is Resource.Error -> {}
//            }
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}