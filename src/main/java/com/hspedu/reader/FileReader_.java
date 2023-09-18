package com.hspedu.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileName：FileReader_
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/18
 * Time: 15:51
 * Description：用FileReader读取文件---文件字符流
 */
public class FileReader_ {

    @Test
    public void test() {
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;
        int buf = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((buf = fileReader.read()) != -1) {
                System.out.print((char) buf);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
