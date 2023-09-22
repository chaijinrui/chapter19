package com.hspedu.standard_;

import java.util.Scanner;

/**
 * FileName：InputAndOutput
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 9:57
 * Description：
 */
public class InputAndOutput {
    public static void main(String[] args) {
//        编译类型 inputStream
//        运行类型 BufferedInputStream
//        标准输入
        System.out.println(System.in.getClass());

//        编译类型 outputStream
//        运行类型 PrintStream
//        标准输出
        System.out.println(System.out.getClass());
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }
}
