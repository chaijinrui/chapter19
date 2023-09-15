package com.hspedu.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Author: chai0
 * Date: 2023/9/14
 * Time: 23:24
 * 注释：
 */
public class FileCreate {

    public static void main(String[] args) {

    }

    /*
    1. 有文件路径来创建文件
     */
    @Test
    public void create01() {
//        在该路径下建一个文件；
//        ’\\‘第一个\是转义符
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
//        开始正真创建一个文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    2. 根据父目录文件，子路径创建
    文件目标路径：e:\news2.txt，那么父目录就是e:\
     */
    @Test
    public void create02() {
        File parentfile = new File("e:\\");
        String fileName = "news2.txt";
//        这里只是创建了java对象
        File file1 = new File(parentfile, fileName);
        try {
//            执行了createNewFile方法，才是真正差创建在磁盘中
            file1.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    3. 根据父目录、子路径创建
    文件目标路径：e:\news3.txt，那么父目录就是e:\
    这个和第一种方法有点类似
     */
    @Test
    public void createN03() {
        String parentPath = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
