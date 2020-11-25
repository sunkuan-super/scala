package com.sk.files


import scala.io.Source

object UpdateFile {
  def main(args: Array[String]): Unit = {
      val iter =  Source.fromFile("C:\\Users\\sunkuan\\Desktop\\111.txt").getLines()
      //val pw = new PrintWriter("D:\\三地市3D-MIMO-ID-经纬度扩大后-小区及邻区列表筛选.csv")
      while (iter.hasNext){
        val str = iter.next()
        var arr = str.split(""",""")
        println(arr.length)
      }
     /* while(iter.hasNext){
        val str = iter.next()
        var arr = str.split(""",""")
        var nstr:String = "";
        for (i<- 0 to arr.length-1){
          if(i<arr.length-1) {
            nstr += arr(i) + ","
          }else{
            nstr+=arr(i)
          }
        }
        //pw.println(nstr)
      }
   // pw.close()*/
    println("sus")
  }

}
