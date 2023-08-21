package _20230601;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 【IMPORTANT】
 * Map:称为 双列集合，使用key(键)--value(值) 的方式存储数据
 *      key -- 是一个Set集合（无下标、五顺序，不重复）
 *      value -- 是一个Collection(List,Set)
 * 实现类：
 *      HashMap
 *      Hashtable
 *      TreeMap
 *      Properties
 * 方法：
 *      put(K,V) 添加元素
 *      get(K) 根据参数K返回对应的value
 *
 *      keySet() 返回所有的键集合
 *      entrySet() 返回所有的值集合
 *      iterator() 返回键值对集合
 *
 *      size() 集合中的元素个数
 *      remove(K) 个面具指定的键删除对应值
 */
public class DemoMap {
    public static void main(String[] args) {
        //定义一个Map集合
        Map<String,String> map = new HashMap<>();
        map.put("东邪","黄药师");
        map.put("西毒","欧阳锋");
        map.put("南帝","段智兴");
        map.put("北丐","洪七公");
        map.put("中神通","王重阳");
        System.out.println(map);
        System.out.println("根据Key获取value："+map.get("西毒"));
        // 键遍历Map 调用 keySet()
        Set<String> keys = map.keySet();
        System.out.println("键遍历--forEach");
        for (String key : keys) {
            System.out.println(key+"--"+map.get(key)+"\t");
        }
        System.out.println("\n键遍历--迭代器iterator");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            //next()方法调用一次指针向下移动一次
            String key = it.next();
            System.out.print(key+"--"+map.get(key)+"\t");
        }
        //键值对遍历：调用 entrySet 方法，返回 entry 对象
        System.out.println("键值对遍历forEach");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("获取键："+entry.getKey()+"获取值:"+entry.getValue());

        }
    }
    public static void Test7(){
        Map<String,String> map = new HashMap<>();
    }
}
