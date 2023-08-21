package Market;

/**
 * 货物类
 */
public class goods{
    long ID;
    String name;
    double price;

    public goods(){}

    public goods(long ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID:" + ID +
                ", 商品名称:'" + name + '\'' +
                ", 价格:￥" + price ;
    }

    public String print1(int num){
        return name+" 单价:￥"+price+" 数量:"+num;
    }
}
