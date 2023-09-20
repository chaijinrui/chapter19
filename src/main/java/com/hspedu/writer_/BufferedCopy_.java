    package com.hspedu.writer_;

    import org.junit.Test;

    import java.io.*;

    /**
     * FileName：BufferedCopy_
     * Author: sns-chaijinrui
     * Date: 2023/9/20
     * Time: 15:04
     * Description：使用字符缓冲流完成文本文件拷贝，不可操作二进制文件
     */
    public class BufferedCopy_ {
        @Test
        public void test1() throws IOException {
            String srcFilepath = "e:\\a.java";
            String newFilepath = "e:\\a1.java";
            BufferedReader bufferedReader=null;
            BufferedWriter bufferedWriter=null;
            try {
                bufferedReader = new BufferedReader(new FileReader(srcFilepath));
                bufferedWriter= new BufferedWriter(new FileWriter(newFilepath));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            }
        }
    }
