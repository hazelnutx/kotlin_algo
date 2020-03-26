package Kyu8

fun main(args: Array<String>) {
    println(past(1,1,1))
    println(past(0,0,0))
    println(past(1,0,1))
}

fun past(h: Int, m: Int, s: Int): Int {
    return (h * 3_600_000 + m * 60_000 + s * 1000)
}