package com.rockthejvm

object BasicsNew extends App {
  private val num: Int = 42

  // Int, Boolean, Char, Float, String
  val aBoolean = false
  val anInterpolation = s"My age is $num"

  val aCodeBlock = {
    val aLocalValue = 67

    aLocalValue + 3
  }

  def myFun(x: Int, y: String):String = y + " " + x
}
