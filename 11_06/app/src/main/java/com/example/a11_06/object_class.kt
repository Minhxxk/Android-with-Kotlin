package com.example.a11_06

//오브젝트 클래스는 익명 클래스를 만들 목적으로 사용
//익명 클래스는 말 그대로 이름이 없다.
//오브젝트 클래스의 타입은 object뒤에 콜론을 입력하고 그 뒤에 클래스의 상위 또는 인터페이스를 입력한다.

//타입을 지정한 오브젝트 클래스
open class Super{
    open var data = 10
    open fun some() {
        println("i am super some() : $data")
    }
}
val obj = object: Super(){
    override var data = 20
    override fun some() {
        println("i am object some() : $data")
    }
}
fun main(){
    obj.data = 30
    obj.some()
}