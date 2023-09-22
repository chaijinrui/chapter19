package com.hspedu.transformation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * FileName：OutputStreamWriter_
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 11:49
 * Description：把fileoutputstream字节流转成outputstreamwriter字符流
 * 指定UTF8格式，使用bufferedOutputreader读取
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hsp.txt";
        OutputStreamWriter outputStreamWriter =  new OutputStreamWriter(new FileOutputStream(filePath), "utf8");
        outputStreamWriter.write("hi~,柴金瑞");
        outputStreamWriter.close();
        System.out.println("按照 gbk 格式保存文件");
    }
}
