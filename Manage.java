package RedPackage;

import java.util.ArrayList;

public class Manage extends User {

    public Manage() {
    }

    public Manage(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来存储若干个红包
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群主有多少钱
        int leftMoney = super.getMoney();//群主当前的余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足！！！");
            return redList;
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包，平均分成count份
        int avg = totalMoney / count;
        //除不尽的红包，包在最后一个红包中
        int mod = totalMoney % count;

        //把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(count);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}
