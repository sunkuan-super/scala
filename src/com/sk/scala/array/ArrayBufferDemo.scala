package com.sk.scala.array

import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    //变长数组
    val b = ArrayBuffer[Int]()
    b+=1   //增加一个元素用+
    println(b)
    b+=(2,3,4,5) //增加多个元素也用+
    println(b)
    b++=Array(6,7,8)
    println(b)
    b-=10    //删除的元素不存在时不报错
    println(b)
    b--=Array(6,7,8,100)  //删除一个数组，数组中存在的数字则删除，数组中不存在的数字不删除
    println("数组不存在的情况："+b)
    b.trimEnd(3)  //删除数组最后的三个元素，没有返回值
    println(b)
    b.insert(1,89)  //往数组中下标为1的位置添加89
    println(b)
    //b.insert(3,100,200,400) //往下标为3的位置添加三个元素100、200、300
    b.remove(1) //移除下标为1的元素
    println(b)
    b.remove(0,2) //移除下标为1开始的3个元素
    println(b)
  }
}
