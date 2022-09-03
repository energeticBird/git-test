package RedPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 100);

        Member member01 = new Member("成员A", 0);
        Member member02 = new Member("成员B", 0);
        Member member03 = new Member("成员C", 0);

        manage.show();
        member01.show();
        member02.show();
        member03.show();
        System.out.println("===========================");

        //群主发20，平均分成3份
        ArrayList<Integer> redPackage = manage.send(10, 3);
        member01.receive(redPackage);
        member02.receive(redPackage);
        member03.receive(redPackage);

        manage.show();
        member01.show();
        member02.show();
        member03.show();

    }
}
