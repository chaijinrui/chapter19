package com.hspedu.writer_;

import java.io.*;

/**
 * FileName：BufferedWriter_
 * Author: sns-chaijinrui
 * Date: 2023/9/20
 * Time: 14:47
 * Description：BufferedWriter基础写入操作
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ok.txt";
        BufferedWriter bufferedWriter = null;
        bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
//        插入一个和系统相关的 换行符
        bufferedWriter.newLine();
        bufferedWriter.write("ddddddddddddddddddddddddddddddddddddd");
        bufferedWriter.close();
    }
}
