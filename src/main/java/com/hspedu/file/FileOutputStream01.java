package com.hspedu.file;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileName：FileOutputStream01
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/17
 * Time: 20:55
 * Description：对文件写入数据
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /*
    将数据写入文件，如果文件不存在，则创建文件
     */
    @Test
    public void writefile() {
//        创建FileOutputStream对象
        String filePath = "e:\\a.txt";
        try {
            //            new FileOutputStream(filePath)覆盖原先的内容
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream.write('H');
//            写入一个字符串
            String str = "1234";

//            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,3);
            System.out.println("写入完毕~");
//
            FileOutputStream fileOutputStream1 = new FileOutputStream(filePath, true);
            fileOutputStream.write(str.getBytes(),0,3);
            System.out.println("写入完毕~");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
