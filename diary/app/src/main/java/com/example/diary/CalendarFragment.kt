package com.example.diary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match


class CalendarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var diaryList = mutableListOf<ItemData>()

    lateinit var recyclerView: RecyclerView
    lateinit var mAdapter: ItemAdapter


    //Fragment가 생성될 때 호출되는 부분
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //onCreate 후에 화면을 구성할 때 호출되는 부분
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_calendar, container, false)
        // Inflate the layout for this fragment
        initRecycler()

        return rootView
    }

    private fun initRecycler() {
        mAdapter = ItemAdapter(requireContext(), diaryList as ArrayList<ItemData>)
        recyclerView.adapter = mAdapter

        diaryList.apply {
            add(ItemData("1", "20211118"))
            add(ItemData("2", "20211118"))

            mAdapter.notifyDataSetChanged()
        }
    }
}