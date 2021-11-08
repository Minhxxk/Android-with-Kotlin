package com.example.a11_05

//데이터 클래스는 data 키워드로 선언하며 자주 사용하는 데이터를 객체로 묶어 줍니다.
//데이터 클래스는 VO(value-object) 클래스를 편리하게 이용할 수 있게 해준다.

////데이터 클래스 선언
//class NoneDataClass(val name: String, val email: String, val age: Int)
//data class DataClass(val name: String, val email: String, val age: Int)
//
////데이터 클래스 객체 생성
//fun main(){
//    val non1 = NoneDataClass("minhxxk", "tactics4421@gmail.com", 25)
//    val non2 = NoneDataClass("minhxxk", "tactics4421@gmail.com", 25)
//
//    val data1 = DataClass("minhxxk", "tactics4421@gmail.com", 25)
//    val data2 = DataClass("minhxxk", "tactics4421@gmail.com", 25)
//
//    //객체의 데이터를 비교하는 equals() 함수
//    println("non data class equals : ${non1.equals(non2)}")
//    println("data class equals : ${data1.equals(data2)}")
//}

//equals()함수로 일반 클래스의 객체를 비교하면 객체 자체를 비교하므로 결과값은 false이다.
//하지만 데이터 클래스의 객체를 비교하면 객체 자체가 아니라 객체의 데이터를 비교하므로 true이다.
//data클래스를 이용하면 객체의 데이터를 비교할 때 훨씬 편리하다.

////데이터 클래스의 equals()함수
//data class DataClass(val name: String, val email: String, val age: Int){
//    lateinit var address: String
//    constructor(name: String, email: String, age: Int, address: String):
//            this(name, email, age){
//            this.address = address
//    }
//}
//fun main(){
//    val obj1 = DataClass("minhxxk", "tactics4421@gmail.com", 25, "seoul")
//    val obj2 = DataClass("minhxxk", "tactics4421@gmail.com", 25, "busan")
//    println("obj1.equals(obj2) : ${obj1.equals(obj2)}")
//}
//실행결과 두 객체를 equals()함수로 비교하면 true가 나온다. 두 객체의 일부 멤버 변숫값은 다르지만, 주 생성자에 선언한 멤버 변숫값이 같으면 true이다.
// 즉, 데이터 클래스의 equals()함수는 주생성자의 멤버 변수가 같은지만 판단한다.

//객체의 데이터를 반환하는 toString()함수
fun main(){
    class NonDataClass(val name: String, val email: String, val age: Int)
    data class DataClass(val name: String, val email: String, val age: Int)
    val non = NonDataClass("minhxxk", "tactics4421@gmail.com", 25)
    val data = DataClass("minhxxk", "tactics4421@gmail.com", 25)
    println(non.toString())
    println(data.toString())
}
//일반 클래스로 생성한 객체의 toString()함수가 출력하는 값은 의미 없는 데이터
//데이터 클래스의 toString()함수는 객체가 포함하는 멤버변수의 데이터를 출력