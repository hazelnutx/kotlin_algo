package Kyu8

/*
Get the number n (n>0) to return the reversed sequence from n to 1.

Example : n=5 >> [5,4,3,2,1]
* */

fun main(args: Array<String>) {
    println(reverseSeq(5))
}

fun reverseSeq(n: Int) = (n downTo 1).toList()
