package com.hspedu.inputstream;

import org.junit.Test;

import java.io.*;

/**
 * FileName：FileCopy
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/18
 * Time: 10:42
 * Description：完成文件拷贝--将”e:\\Sni.png"拷贝到“H:”
 */
public class FileCopy {
    public static void main(String[] args) {

    }

    /*
    思路：方法1 创建输入流，将文件写入内存；创建输出流，将文件写入指定文件；通过字节数组，一次性读取成功，然后边读边写
     */
    @Test
    public void testCopy() {
//        获取文件
        String filePath = "e:\\Sni.png";
        String newFilePath = "H:\\";
        String fileName = "Sni.png";
        File newFile = new File(newFilePath, fileName);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int len = 0;
//            使用while循环，不断从源文件中读取数据到buffer中，直到读取完毕(即read方法返回-1)。
            while ((len = fileInputStream.read(buffer)) != -1) {
//                在循环内部，将buffer中的数据写入目标文件，从0开始，长度为len。
                fileOutputStream.write(buffer, 0, len);
            }
            System.out.println("复制成功~");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
//                关闭流 所以这里只是判断，它没有被创建就关闭时出现的异常
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {

                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
