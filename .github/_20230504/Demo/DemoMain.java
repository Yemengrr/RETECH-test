package _20230504.Demo;

public class DemoMain {
    public static void main(String[] args) {
        Magic m = new Magic("维迦",15,6,new GreenStick());
        System.out.println(m.getName()+"练习前的伤害："+m.attack());

        m.practise();
        System.out.println(m.getName()+"练习后的伤害："+m.attack());


        Bola bola = new Bola();
        Solider s = new Solider();
        s.setHurt(100);
        s.setAge(19);
        bola.SetSolider(s);

        s.practise();

    }
}
