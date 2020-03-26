package Kyu8

fun main(args: Array<String>) {
    println(areaOrPerimeter(4, 4))
}

fun areaOrPerimeter(l:Int, w:Int):Int = if (l == w) l * w else (l + w ) * 2