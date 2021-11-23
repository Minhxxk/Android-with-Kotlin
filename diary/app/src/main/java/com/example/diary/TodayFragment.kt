package com.example.diary

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.diary.databinding.FragmentTodayBinding
import java.time.LocalDate

class TodayFragment : Fragment() {

    lateinit var binding: FragmentTodayBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_calendar, container, false)
        // Inflate the layout for this fragment
        binding = FragmentTodayBinding.inflate(layoutInflater)
//        val todayDate: LocalDate = LocalDate.now()
//        binding.tvDate.setText("$todayDate")

        return rootView
    }


}