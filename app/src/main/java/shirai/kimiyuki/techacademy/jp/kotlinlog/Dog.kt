package shirai.kimiyuki.techacademy.jp.kotlinlog

import android.util.Log

open class Dog:Animal, Movable {

    constructor(name: String, age: Int): super(name, age)

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "[ワンワン]")
    }
    override fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "全力で走った")
    }
}

class BigDog : Dog {
    constructor(name: String, age: Int) : super(name, age) {}

    override fun say() {
        super.say()
        Log.d("kotlintest","大きな犬です")
    }
}