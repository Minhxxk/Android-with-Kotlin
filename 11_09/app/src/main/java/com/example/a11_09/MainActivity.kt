package com.example.a11_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    //뒤로가기 버튼과 볼륨 조절 버튼은 키로 취급해 키 이벤트로 처리할 수 있다.
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.i("minhxxk", "마우스를 클릭하였습니다. x : ${event.x}, y : ${event.y}")
            }
            MotionEvent.ACTION_UP -> {
                Log.i("minhxxk", "마우스를 떼었습니다.")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KeyEvent.KEYCODE_BACK -> {Log.i("minhxxk", "뒤로가기 버튼을 클릭하였습니다.")}
            KeyEvent.KEYCODE_VOLUME_UP -> {Log.i("minhxxk", "볼륨 업 버튼을 클릭하였습니다.")}
            KeyEvent.KEYCODE_VOLUME_DOWN -> {Log.i("minhxxk", "볼륨 다운 버튼을 클릭하였습니다.")}
        }
        return super.onKeyDown(keyCode, event)
    }
}

//터치 이벤트
//터치 : 앱의 화면에서 발생하는 사용자 이벤트
//콜백 함수 : 어떤 이벤트가 발생하거나 시점에 도달했을 때 시스템에서 자동으로 호출하는 함수

//터치 이벤트의 종류
//ACTION_DOWN : 화면을 손가락으로 누른 순간의 이벤트
//ACTION_UP : 화면에서 손가락을 떼는 순간의 이벤트
//ACTION_MOVE : 화면을 손가락으로 누른 채로 이동하는 순간의 이벤트

//터치 이벤트 발생 좌표 얻기
//x : 이벤트가 발생한 뷰의 X좌표
//y : 이벤트가 발생한 뷰의 Y좌표
//rawX : 화면의 X좌표
//rawY : 화면의 Y좌표
//x와 rawX 모두 좌푯값이지만 의미하는 바가 다르다. x는 터치 이벤트가 발생한 뷰에서의 좌푯값이며 rawX는 스크린, 즉 화면에서의 좌푯값


