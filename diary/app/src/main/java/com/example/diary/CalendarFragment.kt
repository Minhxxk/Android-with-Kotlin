package com.example.diary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diary.databinding.FragmentCalendarBinding

// TODO: Rename parameter arguments, choose names that match


class CalendarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var binding: FragmentCalendarBinding
    val diaryList = arrayListOf<ItemData>(
        ItemData("1", "20211118"),
        ItemData("2", "20211118")
    )

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

        //캘린더의 날짜 변경 시
        binding.materialCalendar.setOnDateChangedListener { widget, date, selected ->

        }

        val itemAdapter = ItemAdapter(this, diaryList)
        binding.recyclerView.adapter = itemAdapter

        val layout = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layout
        binding.recyclerView.setHasFixedSize(true)
    }


}