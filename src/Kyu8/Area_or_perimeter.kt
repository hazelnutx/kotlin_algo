package Kyu8

fun main(args: Array<String>) {
    println(areaOrPerimeter(4, 4))
}

/**
 *  If the length and the width are equal we return the area of a square
 *  otherwise, we return the perimeter of a rectangle
 */

fun areaOrPerimeter(l:Int, w:Int):Int = if (l == w) l * w else (l + w ) * 2