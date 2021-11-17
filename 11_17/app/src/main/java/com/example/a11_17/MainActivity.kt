package com.example.a11_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


//ListView와는 다르게 RecyclerView는 이름에서 알 수 있듯이 재활용이 가능한 뷰

class MainActivity : AppCompatActivity() {
    //데이터 목록
    val userList = arrayListOf<dataVo>(
        dataVo("userImg1", "이민혁", "01054864421"),
        dataVo("userImg2", "이민석", "01052754421"),
        dataVo("userImg3", "정선채", "01071900250")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = CustomAdapter(this, userList)
        recyclerView.adapter = mAdapter

        //LinearLayoutManager : 수평, 수직으로 배치 시켜주는 레이아웃 매니저
        val layout = LinearLayoutManager(this)
        recyclerView.layoutManager = layout
        recyclerView.setHasFixedSize(true)
    }
}