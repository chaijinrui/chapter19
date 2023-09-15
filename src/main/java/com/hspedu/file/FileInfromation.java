package com.hspedu.file;

import org.junit.Test;

import java.io.File;

public class FileInfromation {
    public static void main(String[] args) {

    }
/*
   获取文件信息
 */
    @Test
    public void info(){
//        先获取文件对象
        File file = new File("e:\\news1.txt");
//        获取文件名
        System.out.println("文件名："+file.getName());
//        获取绝对路径
        System.out.println("绝对路径："+file.getAbsoluteFile());
//        文件父目录
//        文件大小
//        文件是否存在
//        是不是一个文件
//        是不是一个目录
    }
}
