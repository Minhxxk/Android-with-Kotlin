package com.example.a11_08

//함수 타입을 이용해 함수를 변수에 대입
            //함수 타입          //함수 내용
//val some: (Int, Int) -> Int = {
//    no1: Int, no2: Int -> no1 + no2
//}

//타입 별칭 - typealias
//함수 타입을 typealias를 이용해 선언할 수 있다.
//typealias는 타입의 별칭을 선언하는 키워드로 함수 타입뿐만 아니라 데이터 타입을 선언할 때도 사용한다.

//타입 별칭 선언과 사용
//typealias MyInt = Int
//fun main() {
//    val data1: Int = 10
//    val data2: MyInt = 10
//}

//함수 타입 별칭
//typealias MyFunType = (Int, Int) -> Boolean
//
//fun main(){
//    val someFun: MyFunType = {no1: Int, no2: Int -> no1 > no2}
//    println(someFun(10, 20))
//    println(someFun(20, 10))
//}

//타입 유추에 따른 타입 생략 기법은 typealias를 이용할 때뿐만 해당하는 것이 아니라 타입을 유추할 수 있는 상황이라면 어디서든 통합니다.
//매개변수 타입 선언 생략 예
//val someFun: (Int, Int) -> Boolean = {no1, no2 -> no1 > no2}
//매개 선언 시 타입 생략
//val someFun = {no1: Int, no2: Int -> no1 > no2}


//고차 함수
//고차 함수(high order function)란 매개변수로 전달받거나 전환하는 함수
//데이터가 아닌 함수를 매개변수나 반환값으로 이용하는 함수

fun hofFun(arg: (Int)->Boolean): () -> String{
    val result = if(arg(10)){
        "valid"
        }
    else{
        "invalid"
    }
    return {"hofFun result : $result"}
}
fun main(){
    val result = hofFun {no -> no > 0}
    println(result())
}