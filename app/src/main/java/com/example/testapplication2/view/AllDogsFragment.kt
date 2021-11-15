package com.example.testapplication2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication2.adapter.DogAdapter
import com.example.testapplication2.viewmodel.DogViewModel
import com.example.testapplication2.utils.Resource
import com.example.testapplication2.databinding.FragmentAllDogsBinding
import com.example.testapplication2.models.DogWithBreeds
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AllDogsFragment : Fragment() {

    private var _binding: FragmentAllDogsBinding? = null
    private val binding: FragmentAllDogsBinding get() = _binding!!
    private val viewModel: DogViewModel by activityViewModels()
    private val dogAdapter by lazy { DogAdapter(this::showDogToast) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAllDogsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvList.apply {
                adapter = dogAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
                addItemDecoration(
                    DividerItemDecoration(requireContext(),
                    LinearLayoutManager.VERTICAL)
                )
            }

            viewModel.dogList.observe(viewLifecycleOwner) { dogResponse ->
                when (dogResponse) {
                    is Resource.Loading -> {
                        progressBar.isVisible = true
                    }
                    is Resource.Success -> {
                        progressBar.isVisible = false
                        dogAdapter.submitList(dogResponse.data)
                    }
                    is Resource.Error -> {
                        progressBar.isVisible = false
                        Toast.makeText(requireContext(), dogResponse.errorMsg, Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }

        }
    }

    private fun showDogToast(dog: DogWithBreeds) {
        Toast.makeText(requireContext(), dog.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}