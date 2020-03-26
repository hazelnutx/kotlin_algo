package Kyu8

import java.lang.Math.abs

fun main(args: Array<String>) {
    println(makeNegative(-1))
}

fun makeNegative(x: Int): Int = -abs(x)