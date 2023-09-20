package com.hspedu.outputstream_;

import org.junit.Test;

import java.io.*;

/**
 * FileName：ObjectOutStream_
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/20
 * Time: 22:22
 * Description：使用ObjectOutStream_，完成数据序列化
 */
public class ObjectOutStream_ {
    @Test
    public void testSerialize() {
        String filePath = "e:\\data.dat";
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
//            开始序列化数据到"e:\\data.dat"
//            int→integer  转换成包装类(实现了 Serializeable）
            objectOutputStream.writeInt(100);
            //以下同理
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeChar('a');
            objectOutputStream.writeDouble(123.45);
            objectOutputStream.writeUTF("你好~");
//            保存一个dog对象
            objectOutputStream.writeObject(new Dog("旺财", 12));
            objectOutputStream.close();
            System.out.println("序列化完毕~");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}

