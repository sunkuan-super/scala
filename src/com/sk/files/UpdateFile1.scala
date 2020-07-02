package com.sk.files

import scala.io.Source

object UpdateFile1 {
  def main(args: Array[String]): Unit = {
    val iter =  Source.fromFile("C:\\Users\\sunkuan\\Desktop\\888.csv").getLines()
    while (iter.hasNext){
      val str = iter.next()
      var arr = str.split(""",""")
      println(arr.length)
    }
  }
}
