package com.hspedu.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * FileName：PrintStream_
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 16:19
 * Description：字节打印流
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.println("hewoieowieowe");
        out.write("sjfoieifwf".getBytes());
        out.close();
        System.setOut(new PrintStream("e:\\f1.txt"));
//        再打印，会修改输出位置，输出到刚才文件里
        System.out.println("```````````````````````````");
    }
}
