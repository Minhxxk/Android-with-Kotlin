package com.example.a11_05

//상속 : 클래스를 선언할 때 다른 클래스를 참조해서 선언하는 것
//어떤 클래스를 상속받으려면 선언부에 콜론(:)과 함께 상속받을 클래스 이름을 입력

//클래스 상속 형식
//open class Super{
//    //상속할 수 있게 open 키워드 사용
//}
//class Sub: Super(){
//    //Super를 상속받아 Sub 클래스 선언
//}

//상위 클래스 : 상속 대상이 되는 클래스
//하위 클래스 : 상속받는 클래스
//다른 클래스에서 상속할 수 있게 선언하려면 open키워드를 사용
//매개변수가 있는 상위 클래스의 생성자를 호출할 때는 매개변수 구성에 맞게 인자를 전달해야함

//매개변수가 있는 상위 클래스의 생성자 호출
//open class Super(name: String){         //상위 클래스
//
//    class Sub(name: String): Super(name){   //하위 클래스
//
//    }
//}

//하위 클래스에 보조 생성자만 있는 경우 상위 클래스의 생성자 호출
//open class Super(name: String){
//
//}
//class Sub: Super{
//    constructor(name: String): super(name){
//
//    }
//}
