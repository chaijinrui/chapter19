package com.hspedu.writer_;

/**
 * FileName：Test
 * Author: sns-chaijinrui
 * Date: 2023/9/19
 * Time: 11:53
 * Description：
 */
public class Test {
    public static void main(String[] args) {
//        FileReader_ fileReader_ = new FileReader_();
//         使用节点流
        BufferedReader_ bufferedReader_ = new BufferedReader_( new FileReader_());
        bufferedReader_.readFiles(10);
        System.out.println("================");
//        再封装一层， 调取原本的readFile
        bufferedReader_.readFile();

//        StringReader_同理
        BufferedReader_ bufferedReader = new BufferedReader_(new StringReader_());
    }
}
