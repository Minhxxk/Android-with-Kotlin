package com.example.diary

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.diary.databinding.FragmentTodayBinding
import java.time.LocalDate
import java.util.*

class TodayFragment : Fragment() {

    lateinit var tvDate: TextView
    lateinit var etText: EditText
    lateinit var ivSave: ImageView


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_today, container, false)
        // Inflate the layout for this fragment
        tvDate = rootView.findViewById(R.id.tv_date)
        etText = rootView.findViewById(R.id.et_Text)
        ivSave = rootView.findViewById(R.id.iv_save)

        //현재 날짜 가져오기
        val todayDate: LocalDate = LocalDate.now()
        tvDate.text = todayDate.toString()

        //Save버튼 클릭 시
        ivSave.setOnClickListener{
            val todayText = etText.text.toString()
            etText.text.clear()
//            Log.i("minhxxk", "$todayText")
            //데이터 가지고 이동
           val intent = Intent(this.context, CalendarFragment::class.java)
            intent.apply{
                this.putExtra("date" , todayDate)
                this.putExtra("today", todayText)
            }
            // 이동한 activity에서 추후 받아올 데이터가 없는
            // 단순 데이터 전달 및 이동의 경우
            // startActivity(intent)
            this.context?.startActivity(intent)
        }

        return rootView
    }
}