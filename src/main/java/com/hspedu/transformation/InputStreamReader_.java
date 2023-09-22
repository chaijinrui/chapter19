package com.hspedu.transformation;

import java.io.*;

/**
 * FileName：InputStreamReader_
 * Author: sns-chaijinrui
 * Date: 2023/9/22
 * Time: 11:17
 * Description：演示用inputStreamReader 转换流解决中文乱码问题
 * 将字节流fileinputStream转成字符流inputstreamreader,并设置编码
 * 最终希望用bufferedreader处理流来读取文件，效率高
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "GBK"));
        System.out.println("读取到数据：" + bufferedReader.readLine());
        bufferedReader.close();
    }
}
