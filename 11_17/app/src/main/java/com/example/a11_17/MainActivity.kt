package com.example.a11_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

        val layout = LinearLayoutManager(this)
        recyclerView.layoutManager = layout
        recyclerView.setHasFixedSize(true)
    }
}