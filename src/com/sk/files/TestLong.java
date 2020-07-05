package com.sk.files;

/**
 * @Title: TestLong
 * @Package: com.sk.files
 * @Description:
 * @Author: sunkuan
 * @Date: 2020/7/3 - 23:54
 */
public class TestLong {
    public static void main(String[] args) {
        Long t1 = 100L;
        Long t2 = 100L;

        Long t3 = new Long(100);
        System.out.println(t1 == t2);

        System.out.println(t1==t3);
    }
}
