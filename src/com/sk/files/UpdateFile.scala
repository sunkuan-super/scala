/*
package com.sk.files

import java.io.PrintWriter

import scala.io.Source

object UpdateFile {
  def main(args: Array[String]): Unit = {
      val iter =  Source.fromFile("D:筛选.csv").getLines()
      val pw = new PrintWriter("D:\\筛选.csv")

      while(iter.hasNext){
        val str = iter.next()
        var arr = str.split(""",""")
       /*
        println(arr(5).toDouble*10000)
        println("--------------------------------")
        println(FloatTotalShow.bigDoubleToString(arr(5).toDouble*100000))
        println(FloatTotalShow.bigDoubleToString(arr(5).toDouble*1000000))
        println("********************************")
       */
        //val pp:Int = (arr(5).trim.toDouble*1000000).toInt/10
        arr(4) = FloatTotalShow.bigDoubleToString((arr(4).trim.toDouble*1000000).toInt/10)
        arr(5) = FloatTotalShow.bigDoubleToString((arr(5).trim.toDouble*1000000).toInt/10)
        var nstr:String = "";
        for (i<- 0 to arr.length-1){
          if(i<arr.length-1) {
            nstr += arr(i) + ","
          }else{
            nstr+=arr(i)
          }
        }
        pw.println(nstr)
      }
    pw.close()
    println("sus")
  }

}
*/
