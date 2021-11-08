package com.example.a11_08

//널(null) : 객체가 선언되었지만 초기화되지 않은 상태
//객체는 데이터가 저장된 주소를 참조하므로 흔히 참조변수라고 한다.
//주소 : 데이터가 메모리에 저장되면 어디에 저장됐는지 알아야 이용할 수 있는데 이때 해당 메모리 위치를 식별하는 것
//객체에는 주소가 저장되며 이 주소로 메모리에 접근해서 데이터를 이용
// 널은 객체가 주소를 가지지 못한 상태

//널인 사애의 객체를 이용하면 널 포인트 예외(NullPointException)가 발생
//널포인터 예외는 널인 상태의 객체를 이용할 수 없다는 오류

//널 안전성 : 널 포인트 예외가 발생하지 않도록 코드를 작성하는 것

//널 안전성을 개발자가 고려한 코드
//fun main(){
////    var data: String? = null
//    var data: String? = "minhxxk"
//    val length = if(data == null){
//        0
//    }
//    else{
//        data.length
//    }
//    println("data length : $length")
//}

//코틀린이 제공하는 널 안전성 연상자를 이용한 코드
//fun main(){
//    var data: String? = null
//    println("data length : ${data?.length ?: 0}")
//}

//널 안전성 연산자
//널 허용 - ?연산자
//var data1: String = "minhxxk"
//data1 = null        //오류
//var data2: String? = "minhxxk"
//data2 = null        //성공

//var length = data?.length   //성공

//?. 연산자는 변수가 null이 아니면 멤버에 접근하지만 null이면 멤버에 접근하지 않고 null을 반환

//널 안전성 호출 - ?. 연산자
//var data: String? = "minhxxk"
//var length = data.length    //오류
//널 허용으로 선언한 변수의 멤버에 접근할 때는 반드시 ?.연산자를 이용

//엘비스 - ?: 연산자
//fun main(){
//    var data: String? = "minhxxk"
//    println("data = $data : ${data?.length ?: -1}")
//    data = null
//    println("data = $data : ${data?.length ?: -1}")
//}

//예외 발생 - !! 연산자
fun some(data: String?): Int{
    return data!!.length
}
fun main(){
    println(some("minhxxk"))
    println(some(null))
}