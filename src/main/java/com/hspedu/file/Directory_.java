package com.hspedu.file;

import org.junit.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    /*
    判断文件e:\news1.txt是否存在，如果存在就删除
     */
    @Test
    public void m1() {

//        获取文件对象
        String filIPath = "e:\\news1.txt";
        File file = new File(filIPath);
//        file.exists()文件是否存在
        if (file.exists()) {
            System.out.println("文件存在~");
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除成功");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    /*
   判断文件e:\demo02目录是否存在，如果存在就删除
   再java中，目录也被当做一种文件
    */
    @Test
    public void m2() {
        String filePath = "e:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除不成功");
            }
        } else {
            System.out.println(filePath + "目录不存在");
        }
    }

    /*
   判断文件e:\demo03目录是否存在，如果不存在就创建
   再java中，目录也被当做一种文件
    */
    @Test
    public void m3() {
        String filePath = "e:\\demo03";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println(filePath + "目录存在");
        } else {
            System.out.println(filePath + "目录不存在");
//            file.mkdir()创建一级目录
//            file.mkdirs()创建多级目录
            if (file.mkdir()) {
                System.out.println(filePath + "创建成功");
            } else {
                System.out.println(filePath + "创建不成功");
            }

        }
    }
}
