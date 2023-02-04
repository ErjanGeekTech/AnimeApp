package com.example.animeapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animeapp.R
import com.example.animeapp.databinding.FragmentLocationBinding

class LocationFragment : Fragment(R.layout.fragment_location) {

    private val viewModel: LocationViewModel by viewModels()
    private val binding by viewBinding(FragmentLocationBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}