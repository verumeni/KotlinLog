package com.example.kotlinlog

import android.util.Log

class Human: Animal, Tinkable {

    var hobby: String = ""

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("Human.say", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("Human.think", "私は" + this.hobby + "について考える。")
    }
}