package com.wqf.file;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author 小白学java
 * @version 1.0
 */
public class DirectoryUse {

    public static void main(String[] args) {


    }
    @Test
    public void m() {
        //判断 d:\JAVA入门\JavaCode\Chapter19IOBuffer\news1.txt 是否存在，如果存在就删除
        String filePath = "d:\\JAVA入门\\JavaCode\\Chapter19IOBuffer\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("文件不存在...");
        }
        //判断 d:JAVA入门\JavaCode\Chapter19IOBuffer\demo02 是否存在，存在就删除,不存在就创建该目录
        String filepathAnother = "d:JAVA入门\\JavaCode\\Chapter19IOBuffer\\demo02";
        File file1 = new File(filepathAnother);
        if (file1.exists()) {
            file1.delete();
        } else {
            if (file1.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
    }
}
