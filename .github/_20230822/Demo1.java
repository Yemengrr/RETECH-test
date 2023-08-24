package _20230822;

/**
 * 乘法表
 *  5行3列  3 * 5 = 15
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("乘法表");
        for (int i = 0;i < 9;i++){
            String s9 = "";
            for(int j = 0;j < i+1;j++){
                s9 += (j + 1) + "*" + (i + 1) + "=" + (j + 1) * (i + 1) +"\t";
            }
            System.out.println(s9);
        }
    }
}
