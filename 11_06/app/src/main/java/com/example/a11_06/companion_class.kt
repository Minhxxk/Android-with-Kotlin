package com.example.a11_06

//컴패니언 클래스는 멤버 변수나 함수를 클래스 이름으로 접근하고자 할 때 사용
//일반적으로 클래스의 멤버는 객체를 생성해서 접근해야 하는데 컴패니언 클래스는 객체를 생성하지 않고서도 클래스 이름으로 특정 멤버를 이용할 수 있다.

//컴패니언 클래스의 멤버 접근
class MyClass{
    companion object{
        var data = 10
        fun some(){
            println(data)
        }
    }
}
fun main(){
    MyClass.data = 20
    MyClass.some()
}
//클래스 내부에 companion object{ } 형태로 선언하면 이 클래스를 감싸는 클래스 이름으로 멤버에 접근할 수 있다.
