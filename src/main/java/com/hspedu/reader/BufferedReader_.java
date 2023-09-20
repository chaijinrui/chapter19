package com.hspedu.reader;

import java.io.*;

/**
 * FileName：BufferedReader_
 * Author: sns-chaijinrui
 * Date: 2023/9/20
 * Time: 10:19
 * Description：演示bufferedreader使用
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "e:\\a.java";
        BufferedReader bufferedReader = null;
        String line = null;
        try {
//            使用readline 一行一行读，效率更高
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
//                    这个方法底层还是关闭FileReader
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
