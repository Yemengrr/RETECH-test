package _20230601;

import _20230420.Student;

import java.util.*;

/**
 * 集合：可以存储和管理多个对象。（高级版数组）
 * 泛型:使用<数据类型>规定集合中存储元素的类型
 *  Collection:称单列集合，父接口。
 *      List:子接口，有下标，有顺序（按照索引顺序），元素可重复
 *          ArrayList:底层由数组实现
 *          LinkedList:底层由链表实现
 *          方法：
 *             get(int i) 根据参数返回指定的下标对应的元素
 *             add(int i,E e)指定下标添加元素
 *          遍历： for循环遍历 forEach循环遍历 Iterator迭代器
 *
 *      Set:子接口，无下标，无顺序，元素不可重复
 *          HashSet
 *          TreeSet
 *          方法：
 *              继承 Collection
 *          遍历：forEach循环遍历 Iterator迭代器
 *
 *
 *   方法：
 *      add(E e)向集合中添加元素
 *      remove(Object o)从集合中删除元素
 *      size()返回集合中的元素个数（大小）
 *
 *      toArray()将集合转化为数组
 *      iterator()返回迭代器对象
 *      contains(Object o)判断是否有参数元素返回boolean
 *
 */
public class DemoCollection {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        Object[] obj = new Object[10];
//        obj[0] = 99;
//        obj[1] = "Helle";
//        obj[2] = new Student();
//        String str = (String) obj[1];
//        System.out.println("打印字符串的长度："+str.length());
        //定义一个List集合
//        List<String> list = new ArrayList<>();
//        //添加元素
//        list.add("阿一");
//        list.add("阿二");
//        list.add("阿三");
//        System.out.println(list);
//        System.out.println("获取集合中的元素："+list.get(2));
//        System.out.println("删除集合中的元素："+list.remove(0));
//        System.out.println("删除后的集合："+list);
//        System.out.println("获取集合中的第一个元素："+list.get(0));
//        list.add("阿二");
//        System.out.println(list);
//        //遍历：forEach循环遍历
//        //参数1：表示集合中的元素的数据类型
//        //参数2：当前遍历元素的引用名
//        //参数3：便利的集合对象名
//        for (String s:list) {
//            System.out.print(s+"\t");
//        }
//        Test1();
//        Test();
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");
        set.add("fifth");
        System.out.println(set);
        //遍历Set集合
        System.out.println("使用forEach遍历Set集合");
        for (String s : set) {
            System.out.println(s+"\t");
        }
        System.out.println("使用迭代器遍历Set集合");
        //1.获取 iterator 对象
        Iterator<String> it = set.iterator();
        //2.调用 hasNext() 方法，判断指针下一行是否有数据
        while (it.hasNext()){
            //如果有数据，指针指向下一行并返回数值
            System.out.println(it.next()+"\t");
        }

    }
    public static void Test1(){
        List<String> li = new ArrayList<>();
        li.add("1");
        li.add("2");
        li.add("3");
        li.add("4");
        li.add("5");
        System.out.println("打印集合中元素的个数："+li.toArray().length);
        System.out.println("打印索引为2的元素："+li.get(2));
        System.out.println("删除索引为3的元素："+li.remove(3));
        System.out.println("修改第四个元素："+li.set(3,"四"));
        System.out.println("遍历所有元素:");
        for (String s:li) {
            System.out.print(s+"\t");
        }
    }
    public static void Test(){
        List<String> tb = new ArrayList<>();
        tb.add("《水浒传》");
        tb.add("《三国演义》");
        tb.add("《西游记》");
        tb.add("《红楼梦》");
        System.out.println("书架上共有："+ tb.size()+"本书");
        System.out.print("分别是：");
        for (String s:tb) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("第一本书是："+tb.get(0));
        System.out.println("最后一本书是："+tb.get(3));
        System.out.println("集合中是否包含《金瓶梅》"+tb.contains("《金瓶梅》"));
        System.out.print("将《西厢记》添加到《西游记》之后，书架上：");
        tb.add(tb.lastIndexOf("《西游记》")+1,"《西厢记》");
        for (String s:tb) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("将《红楼梦》替换为《聊斋志异》后，书架上：");
        tb.set(tb.indexOf("《红楼梦》"),"《聊斋志异》");
        for (String s:tb) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("删除《水浒传》和《三国演义》");
        tb.remove("《水浒传》");
        tb.remove("《三国演义》");
        System.out.print("最后添加《儒林外史》、《牡丹亭》、《离骚》，书架上：");
        tb.add("《儒林外史》");
        tb.add("《牡丹亭》");
        tb.add("《离骚》");
        for (String s:tb) {
            System.out.print(s+" ");
        }
    }
}
