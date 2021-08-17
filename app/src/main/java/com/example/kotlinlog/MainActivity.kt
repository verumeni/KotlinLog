package com.example.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*var human = Human("ito", 30, "golf")
        human.say()
        human.think()

        var human2 = Human("sato", 31, "game")
        human2.say()
        human2.think()


        Log.d("conmpanion", Dog.to_jp)

        var dog = Dog("ポチ", 3)
        dog.move()
        dog.say()

        Log.d("kotlintest", "ログへの出力テスト")

        var num = 10
        Log.d("test", num.toString())

        num = 50

        Log.d("test2", num.toString())

        testMethod(60)

        var tst = testMethod2()
        Log.d("tst", tst)*//*var human = Human("ito", 30, "golf")
        human.say()
        human.think()

        var human2 = Human("sato", 31, "game")
        human2.say()
        human2.think()


        Log.d("conmpanion", Dog.to_jp)

        var dog = Dog("ポチ", 3)
        dog.move()
        dog.say()

        Log.d("kotlintest", "ログへの出力テスト")

        var num = 10
        Log.d("test", num.toString())

        num = 50

        Log.d("test2", num.toString())

        testMethod(60)

        var tst = testMethod2()
        Log.d("tst", tst)*/
    }

    fun testMethod(num: Int) {
        Log.d("testMethod", num.toString())
    }

    fun testMethod2() :String {
        var ret: String = "aaa"
        return ret
    }
}