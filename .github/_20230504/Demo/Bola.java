package _20230504.Demo;

/**
 * 大刀
 */
public class Bola implements Weapon{
    private Solider solider;
    public int fire() {
        if(solider.getAge()>18){
            return 100;
        }
        return 50;
    }


    public void SetSolider(Solider s) {
        this.solider = s;
    }


    public Bola() {
    }

    public Bola(Solider solider) {
        this.solider = solider;
    }
}
