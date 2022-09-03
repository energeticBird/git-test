package RedPackage;


public class User{
    private String name;
    private int money;

    //显示用户当前余额
    public void show(){
        System.out.println("我是：" + this.name + ",当前余额为：" + this.money);
    }

    public User(){
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
