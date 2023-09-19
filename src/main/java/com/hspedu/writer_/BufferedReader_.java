package com.hspedu.writer_;

import com.hspedu.writer_.Reader_;

/**
 * FileName：BufferedReader_
 * Author: sns-chaijinrui
 * Date: 2023/9/19
 * Time: 11:43
 * Description：处理流
 */
public class BufferedReader_ extends Reader_ {
    //    定义一个Reader_类型的属性
    private Reader_ reader_;

    //构造器
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //    让方法更灵活,多次读取诗句
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //        再封装一层， 调取原本的readFile
    public void readFile() {
        reader_.readFile();
    }
}
