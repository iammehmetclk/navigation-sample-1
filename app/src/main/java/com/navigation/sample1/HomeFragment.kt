package com.navigation.sample1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "Home Fragment", Toast.LENGTH_SHORT).show()
    }
}