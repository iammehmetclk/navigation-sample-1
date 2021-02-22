package com.navigation.sample1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class CalendarFragment : Fragment(R.layout.fragment_calendar) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "Calendar Fragment", Toast.LENGTH_SHORT).show()
    }

}