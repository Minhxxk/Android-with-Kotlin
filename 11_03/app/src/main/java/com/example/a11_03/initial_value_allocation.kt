package com.example.a11_03

//val data1 : Int                 //오류
//val data2 = 10                  //성공
//
//fun someFun(){
//    val data3 : Int
//    println("data3 : $data3")   //오류
//    data3 = 10
//    println("data3 :  $data3")  //성공
//}
//
//class User {
//    val data4 : Int             //오류
//    val data5 : Int = 10        //성공
//}

//초기화 미루기
//변수를 선언할 때 초깃값을 할당할 수 없는 경우 값을 이후에 할당할 것을 컴파일러에게 알려줘야 함
//lateinit 나 lazy 키워드 사용

//lateinit 키워드는 이후에 초깃값을 할당할 것임을 명시적으로 선언
//lateinit은 var 키워드로 선언한 변수에만 사용할 수 있습니다.
//Int, Long, Short, Float, Boolean, Byte 타입에는 사용할 수 없습니다.
//lateinit var  data1: Int    //오류
//lateinit val data2: String  //오류
//lateinit var data3: String  //성공
//
////lazy 키워드는 변수 선언문 뒤에 by lazy{} 형식으로 선언
//val data4: Int by lazy{
//    println("in lazy")
//    10
//}
//
//fun main(){
//    println("in main")
//    println(data4 + 10)
//    println(data4 + 10)
//}
