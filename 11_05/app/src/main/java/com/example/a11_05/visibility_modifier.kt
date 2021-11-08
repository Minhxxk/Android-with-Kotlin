package com.example.a11_05

//접근 제한자 : 클래스의 멤버를 외부의 어느 범위까지 이용하게 할 것인지를 결정하는 키워드
//public, internal, protected, private
//public : 접근 제한이 없음을 나타낸다. 즉, 원하는 곳 어디서든 접근할 수 있다. 코틀린에서는 변수, 함수, 생성자 등을 선언할 때 접근 제한자를 생략하면 public이 기본
//internal : 같은 모듈 내에서 접근할 수 있는데, 모듈이라는 개념은 그래들이나 메이븐 같은 빌드 도구에서 프로젝트 단위 또는 같은 세트 단위를 가리킴
//protected : 클래스의 멤버에서만 선언할 수 있고 최상위에 선언되는 변수나 함수는 protected로 선언할 수 없다.
//protected로 선언한 클래스의 멤버는 해당 클래스 내부와 그 클래스를 상속받는 하위클래스에서 접근할 수 있다.
//private : 클래스에서 이용할 때는 해당 클래스 내부에서만 접근할 수 있으며, 최상위에서 private으로 선언하면 해당 파일 내부에서만 접근할 수 있다.

//접근 제한자 사용 예
open class Super{
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}

class Sub: Super(){
    fun subFun(){
        publicData++
        protectedData++
//        privateData++   //오류
    }
}
fun main(){
    val obj = Super()
    obj.publicData++
//    obj.protectedData++ //오류
//    obj.privateData++   //오류
}