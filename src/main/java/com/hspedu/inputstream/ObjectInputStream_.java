package com.hspedu.inputstream;

import com.hspedu.outputstream_.Dog;
import org.junit.Test;

import java.io.*;

/**
 * FileName：ObjectInputStream_
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/20
 * Time: 22:50
 * Description：
 */
public class ObjectInputStream_ {
    @Test
    public void test() throws IOException, ClassNotFoundException {
//        反序列化的文件
        String filePath = "e:\\data.dat";
        ObjectInputStream objectInputStream = null;
        objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
//            返序列化顺序需要和序列化顺序一致
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
//        System.out.println(objectInputStream.readObject().toString());
//        dog的编译类型object，运行类型 Dog
        Object dog = objectInputStream.readObject();
//        需要将Dog类的定义，拷贝到可以引入的地方
//        如果需要调用Dog方法，需要下向下转型
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());
        objectInputStream.close();
        System.out.println("反序列化完毕");
    }
}

