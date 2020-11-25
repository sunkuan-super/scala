package com.sk.scala.function

import scala.io.Source

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    println(sum(1,2,3))
    println(sum(1,2,3,4,5))

  }

  /**
   * 变长数组求和
   * @param args 参数是可变的
   * @return 返回的是求和的结果
   */
  def sum(args:Int*)= {
    var result = 0
    println("参数的长度是："+args.length)
    for (arg<-args) result+=arg
    result
  }

}
