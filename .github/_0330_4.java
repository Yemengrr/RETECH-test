package _20230330;

import java.util.Arrays;

/**
 * 复制数组
 */
public class _0330_4 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int[] newArr = new int[arr.length*2];
        //数组搬家
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i]=arr[i];
//        }
        int[] newA = Arrays.copyOf(arr,arr.length*2);
        //遍历
        System.out.println("原数组arr：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("新数组arr：");
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i]+"\t");
        }
    }
}
