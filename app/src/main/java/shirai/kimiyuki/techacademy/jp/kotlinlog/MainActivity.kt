package shirai.kimiyuki.techacademy.jp.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tanaka = Human("田中", 30, hobby = "車")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val sato = Human("佐藤", 40, hobby="アニメ")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        tanaka.say()
        tanaka.think()
        sato.say()
        sato.think()
    }
}
