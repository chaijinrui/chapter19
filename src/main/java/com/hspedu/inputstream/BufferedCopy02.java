package com.hspedu.inputstream;

import org.junit.Test;

import java.io.*;

/**
 * FileName：BufferedCopy02
 * Author: sns-chaijinrui
 * Date: 2023/9/20
 * Time: 15:52
 * Description：使用字节处理流拷贝二进制文件
 */
@SuppressWarnings({"all"})
public class BufferedCopy02 {
    @Test
    public void testCopy01() {
        String srcFilePath = "e:\\srcKaola.png";
        String newFilePath = "e:\\newKala.png";
//        创建对象
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
//            FileInputStream 是 InputStream 的子类
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFilePath));
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
