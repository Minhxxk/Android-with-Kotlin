package com.example.a11_03

//fun main(){
//    var sum: Int = 0
//    for(i in 1..10){
//        sum += i
//    }
//    println(sum)
//}
//for(i in 1..10){} -> 1부터 10까지 1씩 증가
//for(i in 1 until 10){} -> 1부터 9까지 1씩 증가(10은 미포함)
//for(i in 2..10 step 2){} ->2부터 10까지 2씩 증가
//for(i in 10 downTo 1){} -> 10부터 1까지 1씩 감소

////반복 조건에 컬렉션 타입 활용
//fun main()  {
//    var data = arrayOf<Int>(10, 20, 30)
//    //indices는 컬렉션 타입의 인덱스 값을 의미
//    //만약 for문을 반복하면서 인덱스와 실제 데이터를 함께 가져오려면 withIndex()함수를 이용
//    for(i in data.indices){
//        print(data[i])
//        if(i !== data.size - 1) print(", ")
//    }
//}

////인덱스와 데이터를 가져오는 widhIndex() 함수
//fun main(){
//    var data = arrayOf<Int>(10, 20, 30)
//    for((index, value) in data.withIndex()){
//        print(value)
//        if(index !== data.size - 1) print(", ")
//    }
//}

//while반복문
fun main(){
    var x = 0
    var sum = 0
    while(x < 10){
        sum += ++x
    }
    println(sum)
}