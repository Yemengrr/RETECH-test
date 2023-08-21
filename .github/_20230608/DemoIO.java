package _20230608;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/** 使用Java中的IO系类的API来实现操作硬盘文件。包括新建文件或目录（文件夹）删除、修改等。
 * IO类:拿数据的传输看作一种流向，以内存为基准，流向硬盘的称为输出流(Out)（写），由硬盘流向内存的称为输入流(In)（读）
 *  File类 表示一个文件或目录（对象）
 *
 *  字节流：可以操作任何文件
 *      抽象类：OutputStream/InputStream 字节输出流/字节输入流
 *          子类：FileOutputStream/FileInputStream 文件字节输出流/文件字节输入流
 *  字符流：专门操作文本文件的流对象
 *      抽象类：Reader/Writer 字符输入流/字符输出流
 *          子类：FileReader/FileWriter 文件字符输入流/文件字符输出流
 *  缓冲流:
 *      子类：BufferedReader/BufferedWriter 缓冲字符输入流/缓冲字符输出流
 *
 *
 *
 */
public class DemoIO {
    public static void main(String[] args) throws IOException {
//        // 新建一个 a.html文件
//        File file = new File("D:/a.html");
//        //调用 createNawFile
//        file.createNewFile();
//        //新建文件夹
//        File game = new File("D:\\wegame");
//        game.mkdir();
//        //删除文件或者空文件夹
//        game.delete();
//        file.delete();
//        File f1 = new File("D:/test/t1/a.css");
//        f1.mkdirs();
        //如何向文件中写入数据？

        //使用字节流，写出数据到硬盘
        OutputStream os = new FileOutputStream("D:/a.html");
        String str = "<h1>Hello</h1>";
        byte[] bytes = str.getBytes();
        //写出数据
        os.write(bytes);
        //关闭资源
        os.close();
        //使用字节流读取数据到内存
        InputStream is = new FileInputStream("D:/abc.txt");
        //read()读取数据，返回int类型0~255之间的整数，表示读到的字节数，-1表示没有读取到数据。
        int i=0;
        while ((i=is.read()) != -1){
            System.out.print((char)i);
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    /**
     * 任务1：文件复制
     * 封装一个方法，传入2个参数表示目标文件和赋值后的文件，使用字节流实现文件复制。
     */
    public static void copyFile(String target,String newFile) throws IOException {
        OutputStream fos = new FileOutputStream(newFile);
        FileInputStream fis = new FileInputStream(target);
        //边读边写
        int i = 0;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        //关闭资源
        fos.close();
        fis.close();
    }
    /**
     * 任务2：文本排序
     * 封装一个方法：传入两个参数分别表示排序前和排序后的文件，使用字符缓冲流读取文件，排序后写出到新文件中
     * 分析：
     *  1.创建BufferedReader 和 BufferedWriter 对象
     *  2.逐行读取文本，使用 split 方法，将字符串分割为字符数组，分隔符为.（提示：“.”需要使用\\转义字符）
     *  3.存入Map集合中，序号作为键，文本内容作为值（提示：使用treeMap可实现默认排序）
     *  4.遍历Map集合，并将 键 和 值 输出到新文件中
     */
    public static void sortText(String target,String newFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(target));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String content = null;
        Map<String,String> map = new TreeMap<>();
        while(null != (content= br.readLine())){
            String key = content.split("\\.")[0];
            String value = content.split("\\.")[1];
            map.put(key,value);
        }
        Set<String> keys = map.keySet();
        for (String key: keys) {
            bw.write(key+"."+ map.get(key));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
