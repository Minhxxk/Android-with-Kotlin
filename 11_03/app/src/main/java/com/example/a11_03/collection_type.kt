package com.example.a11_03

//컬렉션 타입이란 여러개의 데이터를 표현하는 방법. Array, List, Set, Map
//Array - 배열 표현
//Array클래스의 생성자엣 첫 번째 매개변수는 배열의 크기, 두 번째 매개변수는 초깃값을 지정하는 함수
//배열의 타입은 generic으로 표현
//제네릭은 선언하는 곳이 아니라 이용하는 곳에서 타입을 지정하는 기법
//fun main(){
////    val data1: Array<Int> = Array(3, {0})
////    data1[0] = 10
////    data1[1] = 20
////    data1.set(2, 30)
//    val data1 = arrayOf<Int>(10, 20, 30)
//
//    println(
//        """
//        array size: ${data1.size}
//        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
//        """.trimIndent())
//}

//List, Set, Map
//Collection 인터페이스를 타입으로 표현한 클래스
//List : 순서가 있는 데이터 집합으로 데이터의 중복을 허용
//Set : 순서가 없으며 데이터의 중복을 허용하지 않음
//Map : 키와 값으로 이루어진 데이터 집합으로 순서가 없으며 키의 중복은 허용하지 않음


//List는 불변 타입이므로 size(), get() 함수만 제공하고 데이터를 추가하거나 변경하는 add(), set()함수는 제공x
//MutableList는 가변 타입이므로 size(), get(), add(), set() 함수 이용 가능
//Set, Map도 마찬가지로 불변타입이며 MutableSet, MutableMap은 가변타입이다.

//Map객체는 키와 값으로 이루어진 데이터의 집합. Map객체의 키와 값은 Pair객체를 이용할 수 있고 '키 to 값' 형태로도 이용 가능
fun main(){
    var map = mapOf<String, String>(Pair("one", "min"), "two" to "hyeok")
    println("""
        map size : ${map.size}
        map data : ${map.get("one")}, ${map.get("two")}
    """.trimIndent())
}