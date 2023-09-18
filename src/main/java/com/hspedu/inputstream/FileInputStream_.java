package com.hspedu.inputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileName： FileInputStream_
 * Author：sns-chaijinrui
 * date：2023-09-15
 * Description：FileInputStream字节输入流 ，把文件导入到程序里去
 **/
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /*
    读取文件  read()
     */
    @Test
    public void readFile01() throws IOException {
        String filePath = "e:\\hello.txt";
        int read = 0;

        FileInputStream fileInputStream = null;
        try {
            //    获取fileinputstream对象
            fileInputStream = new FileInputStream(filePath);
//            fileInputStream.read() 一个一个字节读取文件，-1的时候读取完毕，遇到汉字就gg
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            关闭流
            fileInputStream.close();
        }
    }

    /*
读取文件  read(byte[] n) 提交效率
 */
    @Test
    public void readFile02() throws IOException {
        String filePath = "e:\\hello.txt";
        //        字节数组
        byte[] bytes = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //    获取fileinputstream对象
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(bytes)) != -1) {
//                第3个开始，取4个字节
                System.out.print(new String(bytes, 2, 4));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            关闭流hello,world
            fileInputStream.close();
        }
    }
}



