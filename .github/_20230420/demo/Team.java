package _20230420.demo;

public class Team {
    private Role[] roles = new Role[6];
    private int i = 0;
    public void addMember(Role role){
        //方法：添加成员
        if(i>=6){
            System.out.println("此队伍已满");
            return;
        }
        roles[i] = role;
        i++;
    }
    public int attackSum(){
        //方法：队伍攻击
        //如果数组中人数不满
        int atk=0;
        //计算总伤害
        for (int j = 0; j < roles.length ; j++) {
            System.out.println(roles[j].getName()+"的伤害："+roles[j].attack());
            atk += roles[j].attack();
        }
        return atk;
    }
}
