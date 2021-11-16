package com.example.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.diary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    //메뉴 구성 함수
    //액티비티 코드에 menu.xml 적용
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){
        R.id.menu1 -> {
            Toast.makeText(this, "menu1 클릭", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.menu2 -> {
            Toast.makeText(this, "menu2 클릭", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.menu3 -> {
            Toast.makeText(this, "menu3 클릭", Toast.LENGTH_SHORT).show()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

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