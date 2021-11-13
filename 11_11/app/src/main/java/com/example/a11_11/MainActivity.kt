package com.example.a11_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.get
import com.example.a11_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, TodayFragment())
        transaction.commit()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tab1.setOnClickListener {
            setTodayFragment()
        }
        binding.tab2.setOnClickListener {
            setCalendarFragment()
        }
        binding.tab3.setOnClickListener {
            setSettingFragment()
        }
    }

    private fun setTodayFragment() {
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, TodayFragment())
        transaction.commit()
    }
    private fun setCalendarFragment() {
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, CalendarFragment())
        transaction.commit()
    }
    private fun setSettingFragment() {
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, SettingFragment())
        transaction.commit()
    }


}