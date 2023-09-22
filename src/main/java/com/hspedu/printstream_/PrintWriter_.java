package com.hspedu.printstream_;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * FileName：PrintWriter_
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 16:41
 * Description：PrintWriter使用方法
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
//
        PrintWriter printWriter = new PrintWriter("e:\\f2.txt");
        printWriter.print("dksodifosjfdiofj");
        printWriter.close();
    }
}
