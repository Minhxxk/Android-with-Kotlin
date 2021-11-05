package com.example.a11_04

//본문은 없고 선언부만 있는 클래스가 의미가 있을까?
//자바 프로그래밍에서는 멤버가 없고 선언부만 있는 클래스는 의미가 없습니다.
//하지만 코틀린에서는 클래스의 생성자를 본문이 아닌 선언부에 작성할 수 잇어서 본문이 업슨 클래스도 의미가 있다.
//코틀린에서는 이러한 클래스가 자주 등장

//클래스의 멤버는 생성자, 변수, 함수, 클래스로 구성
//코틀린의 생성자는 constructor라는 키워드로 선언하는 함수

////클래스의 멤버
//class User{
//    var name = "kkang"
//    constructor(name: String){
//        this.name = name
//    }
//    fun someFun(){
//        println("name : $name")
//    }
//    class SomeClass{}
//}

//코틀린 클래스는 생성자를 주 생성자와 보조 생성자로 구분
//주 생성자를 선언할 때 constructor 키워드는 생략할 수 있다.


//주 생성자의 본문 - init 영역
//init 키워드로 주 생성자의 본문 지정
//class User(name: String, count: Int){
//    init {
//        println("i am init..")
//        println(name)
//        println(count)
//    }
//}
//fun main(){
//    val user = User("minhxxk", 25)
//}

//생성자의 매개변수를 클래스의 멤버 변수로 선언하는 방법
//생성자의 매개변수는 기본적으로 생성자에서만 사용할 수 있는 지역 변수

//생성자의 매개변수를 init영역에서 사용하는 예
//class User(name: String, count: Int){
//    init{
//        println("name: $name, count: $count")   //성공
//    }
//    fun someFun(){
//        println("name: $name, count: $count")   //오류
//        }
//}

//생성자의 매개변수를 다른 함수에서 사용하는 예
class User(name: String, count: Int){
    //클래스 멤버 변수 선언
    var name: String
    var count: Int
    init {
        // 클래스의 멤버 변수에 생성자 매개변수값 대입
        this.name = name
        this.count = count
    }
    fun someFun(){
        println("name : $name, count: $count")
    }
}
fun main(){
    val user = User("minhxxk", 25)
    user.someFun()
}