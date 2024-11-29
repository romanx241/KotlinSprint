package org.example.lesson_3

fun main() {
    val num = 6
    val num1 = num * 1
    val num2 = num * 2
    val num3 = num * 3
    val num4 = num * 4
    val num5 = num * 5
    val num6 = num * 6
    val num7 = num * 7
    val num8 = num * 8
    val num9 = num * 9
    //val colPattern = "%7s\n%7s\n%7s\n%7s\n%7s\n%7s\n%7s\n%7s\n%7s"
   // println(colPattern.format("$num * 1 = $num1", "$num * 2 = $num2", "$num * 3 = $num3", "$num * 4 = $num4",
       // "$num * 5 = $num5", "$num * 6 = $num6", "$num * 7 = $num7", "$num * 8 = $num8", "$num * 9 = $num9")


    println("""
        $num * 1 = $num1 
        $num * 2 = $num2 
        $num * 3 = $num3 
        $num * 4 = $num4 
        $num * 5 = $num5
        $num * 6 = $num6 
        $num * 7 = $num7 
        $num * 8 = $num8 
        $num * 9 = $num9
        """.trimIndent()
    )
}