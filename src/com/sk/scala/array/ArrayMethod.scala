package com.sk.scala.array

object ArrayMethod {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5)
    val arr1 = Array(1,2,3,4,5,4,3,2,1)
    val sum = arr.sum //数组求和
    println(sum)
    val product = arr.product  //数组中元素求和
    println(product)
    // max、min、sorted方法，要求数组元素支持比较操作
    println(Array(1,2,3,4,5,6,7,8,9,10).max)
    println(Array(1,2,3,4,5,6,7,8,9,10).min)
    println(Array(10,9,8,7,6,5,4,3,2,1).sorted.toBuffer)
    println("---------------------------map和foreach区别-----------------------------")
    //map和foreach的区别
    println(Array(1,2,3,4,5,4,3,2,1).map(_*2))   //map有返回值
    println(Array(1,2,3,4,5,4,3,2,1).foreach(_*2)) //foreach无返回值
    //reduce方法
    println(Array(1,2,3,4,5,4,3,2,1).reduce(_+_))
    println(Array(1,2,3,4,5,4,3,2,1).reduce((x,y)=>{
      println(x,y)
      x+y
    }))
    //distinct
    println("distinct:"+Array(1,2,3,4,5,4,3,2,1).distinct.toBuffer)
    //length
    println("length:"+arr1.length)
    //size
    println("size:"+arr1.size)
    //indices  将数组Array转化成Range
    println("indices:"+arr1.indices)

    //count  求数组中元素大于3的数量
    println("求数组中大于3的元素的个数："+Array(1,2,3,4,5,4,3,2,1).count(_>3))
    //filter  /filterNot同理
    println("filter:"+arr1.filter(_%2==0).toBuffer)
    // mkString和toBuffer打印数组元素简单高效的方法
    println("mkString="+arr1.mkString("#"))
    println("toString="+arr1.toString)
    println("mkString="+arr1.mkString("<","&",">"))
    //zip

  }
}
