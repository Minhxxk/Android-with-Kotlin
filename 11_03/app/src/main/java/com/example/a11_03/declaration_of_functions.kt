package com.example.a11_03

//fun 함수명(매개변수명: 타입): 반환타입{}
//반환타입을 선언할 수 있으며 생략하면 자동으로 Unit타입이 적용
//함수의 매개변수에는 var나 val 키워드를 사용할 수 없다.
//val이 자동으로 적용되며 함수 안에서 매개변숫값을 변경할 수 없다.

fun main() {
    fun some(data1: Int, data2: Int = 10): Int{
        return data1 * data2
    }
    println(some(10))
    println(some(10, 20))
}