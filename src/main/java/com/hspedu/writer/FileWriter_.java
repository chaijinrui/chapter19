package com.hspedu.writer;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileName：FileWriter_
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/18
 * Time: 22:00
 * Description：
 */
public class FileWriter_ {

    @Test
    public void writer() {
        String filePath = "e:\\note.txt";
        FileWriter fileWriter1 = null;
        char[] buf = new char[100];
        int len = 0;
        try {
            fileWriter1 = new FileWriter(filePath);
            fileWriter1.write("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter1.close();
                System.out.println("程序已结束~");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
