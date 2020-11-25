package com.sk.scala.array

object ArrayTest {
  def main(args: Array[String]): Unit = {
    //定长数组
      val intValueArr = new Array[Int](3)
      intValueArr(0)=0
      intValueArr(1)=1
      intValueArr(2)=2
      println(intValueArr.toBuffer)


  }

}
