package com.devpass.spaceapp.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.devpass.spaceapp.R
import com.devpass.spaceapp.databinding.LaunchDetailsFragmentBinding
import com.devpass.spaceapp.presentation.viewmodels.NextLaunchesViewModel

class LaunchDetailsFragment : Fragment(R.layout.launch_details_fragment) {

    private val viewModel by activityViewModels<NextLaunchesViewModel>()

    private var _binding: LaunchDetailsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LaunchDetailsFragmentBinding.inflate(inflater, container, false)
        setView()

        return binding.root
    }

    private fun setView() {
        binding.descriptionText.text = getString(R.string.launch_details_dummy_text)
        binding.viewMoreButton.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "Chamar LaunchDetailsActivity aqui",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}