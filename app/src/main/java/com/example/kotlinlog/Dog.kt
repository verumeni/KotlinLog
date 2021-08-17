package com.example.kotlinlog

import android.util.Log

class Dog: Movable {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun say() {
        Log.d("dogtest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    companion object {
        val to_jp = "犬"
    }

    override fun move() {
        Log.d("move", this.name + "(" + this.age + "歳)" + "は全力で走った")
    }
}