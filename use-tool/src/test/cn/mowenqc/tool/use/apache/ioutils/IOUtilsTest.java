package cn.mowenqc.tool.use.apache.ioutils;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.util.List;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/1 15:33
 * @description:
 *****/
public class IOUtilsTest {
    String file = "G:\\document\\文件目录.txt";

    @Test
    public void testCloseFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        IOUtils.closeQuietly(fileInputStream);
        int available = fileInputStream.available();
        System.out.println(available);
        /**
         * java.io.IOException: Stream Closed
         */
    }

    @Test
    public void testReadLines() throws IOException {
        List<String> list = IOUtils.readLines(new FileReader(file));
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void testToString() throws IOException {
        //读取很好用
        String string = IOUtils.toString(new FileReader(file));
        System.out.println(string);

        //写比较操蛋， 必须要flush与关闭流，这样让我很不顺心，自己封装一下，在写一个呗
        FileWriter fileWriter = new FileWriter("G:\\document\\1.txt");
        IOUtils.write(string, fileWriter);
        fileWriter.flush();
        IOUtils.closeQuietly(fileWriter);

    }
}
