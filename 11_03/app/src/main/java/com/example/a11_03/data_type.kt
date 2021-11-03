package com.example.a11_03

import java.lang.Exception

////Int타입에 null대입과 메서드 이용
//fun someFun(){
//    var data1 : Int = 10
//    var data2 : Int? = null
//
//    data1 = data1 + 10
//    data1 = data1.plus(10)  //객체의 메서드 이용가능
//}

//Any - 모든 타입 가능
//val data1: Any = 10
//val data2: Any = "Hello"
//
//class User
//val data3: Any = User()
//
////Unit - 반환문이 없는 함수
//val data1: Unit = Unit
//
////사용 예
//fun some(): Unit{
//    println(10 + 20)
//}
//
////Nothing - null이나 예외를 반환하는 함수
////사용 예
//val data1: Nothing? = null
//
////null반환 함수와 예외를 던지는 함수
//fun some1(): Nothing?{
//    return null
//}
//fun some2(): Nothing{
//    throw Exception()
//}
//
////널 허용과 불허용
////타입 뒤에 물음표를 추가하면 널 허용으로 선언
//var data1: Int = 10
//data1 = null    //오류
//
//var data2: Int? = 10
//data2 = null    //성공
