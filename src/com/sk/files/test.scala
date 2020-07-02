package com.sk.files

import java.io.PrintStream

import scala.io.Source

object test {
  def main(args: Array[String]): Unit = {

    val arr = Source.fromFile("D:\\三地市3D-MIMO-ID-经纬度扩大后-小区及邻区列表筛选.csv").getLines().toArray
    arr.map(x => {
      println(x)
      val result = x.split(""",""")(5).toInt
      println(result)
    })
  }
}
