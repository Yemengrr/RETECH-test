package _20230822;


public class Demo2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int n1 = 0;
        add(n1);
        System.out.println(n1);

        Integer n = 0;
        addInt(n);
        System.out.println(n);


        Foo a = new Foo();
        System.out.println(a.n);
        addN(a);
        System.out.println(a.n);
    }

    private static void addN(Foo a) {
        a.n++;
    }

    private static void addInt(Integer n) {
        n++;
    }

    private static void add(int n1) {
        n1++;
    }
}
class Foo{
        int n;
}
