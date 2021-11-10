 package com.example.a11_10

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.util.*

 //다이얼로그(Dialog)란 사용자와 상호 작용하는 대화상자
 //Toast.LENGTH_SHORT는 3초, Toast.LENGTH_LONG은 5초


class MainActivity : AppCompatActivity(){
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_date = findViewById<Button>(R.id.btn_date)
        val btn_time = findViewById<Button>(R.id.btn_time)

        btn_date.setOnClickListener {showDatePicker()}
        btn_time.setOnClickListener { showTimePicker() }
    }
    //토스트는 makeText()함수를 이용하지 않고 세터함수로 만들수도 있다.
    //setDuration(), setText() 함수를 이용하면 문자열이나 화면에 보이는 시간을 설정
    //setGravity()나 setMargin() 함수를 이용하면 토스트 가 뜨는 위치를 설정

    //    //API 레벨 호환성 애너테이션
//    @RequiresApi(Build.VERSION_CODES.R)
//
//    fun showToast(){
//        val toast = Toast.makeText(this, "종료하려면 한 번 더 누르세요.", Toast.LENGTH_SHORT)
//        //토스트의 콜백을 등록하려면 Toast.Callback타입의 객체를 토스트 객체의 addCallback()함수로 등록해주면 된다.
//        toast.addCallback(
//            object: Toast.Callback(){
//                //토스트가 화면에서 사라지는 순간
//                override fun onToastHidden() {
//                    super.onToastHidden()
//                    Log.i("minhxxk", "Toast Hidden")
//                }
//                //토스트가 화면에서 뜨는 순간
//                override fun onToastShown() {
//                    super.onToastShown()
//                    Log.i("minhxxk", "Toast Shown")
//                }
//            })
//        toast.show()
//    }

    //피커 다이얼로그 : 앱에서 사용자에게 날짜나 시간을 입력받는 데 사용하는 다이얼로그
    //날짜를 입력받을 때는 DatePickerDialog. 시간을 입력받을 때는 TimePickerDialog
    private fun showDatePicker() {
        val cal = Calendar.getInstance()
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, y, m, d->
            Toast.makeText(this, "$y-$m-$d", Toast.LENGTH_SHORT).show()}
            , cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).show()
    }
    private fun showTimePicker() {
        val cal = Calendar.getInstance()
        TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, h, m ->
            Toast.makeText(this, "$h:$m", Toast.LENGTH_SHORT).show() }
            , cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), true).show()
    }
}
