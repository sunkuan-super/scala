package com.sk.files;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo01 {
    public static void main(String[] args) {
        String str = "";
        // 首先要编译正则规则形式
        Pattern p = Pattern.compile("\\s*");
        // 将正则进行匹配
        Matcher m = p.matcher(str);
        // 进行判断
        boolean b = m.matches();
        System.out.println(b);
        m.find();
        //System.out.println(m.group(0));
        System.out.println(m.group(0));

    }
}
