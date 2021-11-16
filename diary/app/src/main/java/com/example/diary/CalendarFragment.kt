package com.example.diary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diary.databinding.FragmentCalendarBinding

// TODO: Rename parameter arguments, choose names that match


class CalendarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var binding: FragmentCalendarBinding

    //Fragment가 생성될 때 호출되는 부분
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //onCreate 후에 화면을 구성할 때 호출되는 부분
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false)
        binding = FragmentCalendarBinding.inflate(layoutInflater)
        
        binding.materialCalendar.setOnDateChangedListener { widget, date, selected ->

        }
    }


}