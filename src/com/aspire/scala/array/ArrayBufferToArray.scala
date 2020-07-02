package com.aspire.scala.array

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBufferToArray {
  def main(args: Array[String]): Unit = {
    val arrayBuffer:ArrayBuffer[Int] = ArrayBuffer[Int]()
    arrayBuffer+=1
    arrayBuffer+=2
    println("arrayBuffer = " +arrayBuffer)
    val array:Array[Int] = arrayBuffer.toArray //变长数组转化成定长数组
    println("array = "+array)
    val buff:mutable.Buffer[Int] = array.toBuffer //定长数组转化成变长数组
    println("buff = "+buff)
    buff+=3
    println(buff)
  }
}
