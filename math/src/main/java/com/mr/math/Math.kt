package com.mr.math

class Arithmetic : MathOperation {

    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun modulo(a: Int, b: Int): Int {
        return a % b
    }

    fun area(a: Int, b: Int): Int {
        return a * b
    }
}
