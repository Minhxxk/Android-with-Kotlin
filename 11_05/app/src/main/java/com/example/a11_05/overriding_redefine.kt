package com.example.a11_05

//상속 관계인 두 클래스
//open class Super{
//    var superData = 10
//    fun superFun(){
//        println("i am superFun : $superData")
//    }
//}
//class Sub: Super()
//fun main(){
//    val obj = Sub()
//    obj.superData = 20
//    obj.superFun()
//}

//오버라이딩 : 상위클래스에 선언된 변수나 함수를 같은 이름으로 하위클래스에서 다시 선언하는 것

//오버라이딩 예
//open class Super{
//    open var someData = 10
//    open fun someFun(){
//        println("i am super class function : $someData")
//    }
//}
//
//class Sub: Super(){
//    override var someData = 20
//    override fun someFun() {
//        super.someFun()
//        println("i am super class function : $someData")
//    }
//}
//fun main(){
//    val obj = Sub()
//    obj.someFun()
//}

//오버라이딩 규칙은 먼저 상위 클래스에서 오버라이딩을 허용한 변수나 함수 선언 앞에 open키워드를 추가하는 것
//open키워드로 선언한 변수나 함수를 하위 클래스에서 재정의 할때는 반드시 선언문 앞에 override 키워드를 추가해야 한다.

