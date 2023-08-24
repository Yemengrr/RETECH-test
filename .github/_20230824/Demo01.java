package _20230824;

import javax.swing.*;
import java.util.*;

public class Demo01 {
    public static void main(String[] args) {

        //list 可变长度的数组
        List<Integer> l = new ArrayList();
        //添加元素
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        //指定位置添加元素
        l.add(1,4);
        System.out.println(l);
        //根据下标获取数据
        System.out.println(l.get(3));
        //删除元素
        l.remove(2);
        System.out.println(l);

        System.out.println("=====遍历=====");
        System.out.println("-----for-----");
        for (int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }
        System.out.println("-----foreach-----");
        for (Integer dto:l) {
            System.out.println(dto);
        }

        //Set
        System.out.println("=====short=====");
        Set<Short> s = new HashSet<>();
        short s1 = 12;
        s.add(s1);
        short s2 = 12;
        s.add(s2);
        short s3 = 11;
        s.add(s3);
        System.out.println(s);
        //s.remove(s3);
        //System.out.println(s);

        System.out.println("=====遍历=====");
        System.out.println("-----foreach-----");
        for (Short dto:s) {
            System.out.println(dto);
        }

        //Map
        System.out.println("=====Map=====");
        Map<String, String> m = new HashMap<>();
        m.put("name","foo");
        m.put("name","goo");
        m.put("age","11");
        System.out.println(m);
        System.out.println(m.get("age"));
        m.remove("name");
        System.out.println(m);

        System.out.println("=====遍历=====");
        Set<String> ks = m.keySet();
        for (String dto:ks) {
            System.out.println(dto + ":" + m.get(dto));
        }
        for (Map.Entry<String, String> dto : m.entrySet()) {
            System.out.println(dto);
        }





    }
}
