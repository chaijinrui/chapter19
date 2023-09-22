package com.hspedu.transformation;

import org.junit.Test;

import java.io.*;

/**
 * FileName：CodeQuestion
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 10:15
 * Description：中文乱码问题
 * bufferedreader默认识别UTF8编码方式的文件，当文件为非UTF8编码时，read时会出现乱码
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
//       创建字符输入流
        String filePath = "e:\\a.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("你好，我叫柴金瑞;");
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
