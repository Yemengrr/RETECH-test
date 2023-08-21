package _20230330;

import java.util.Arrays;

public class _0330_3 {
    public static void main(String[] args) {
        /**
         * 冒泡排序：
         *      数组中的元素两两比较，如果前一个数大于后一个，则交换两数位置。
         *
         *
         */
        /* 随机初始化数组 */
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) (Math.random()*10);

        }
        System.out.println("排序前：");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //使用Arrays工具类的排序方法
        Arrays.sort(arr);
//冒泡排序:
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                }
//            }
//        }
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
