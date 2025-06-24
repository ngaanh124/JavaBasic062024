package DemoCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoCollectionArrayList {
    public static void main(String[] args) {
        //Khai bao kieu du lieu
        //Duoc phep luu nhieu value trung lap
        List<String> menu = new Stack<>();

        //ArrayList<String> menu2 = new Stack<>();

        //Them du lieu
        menu.add("Project");
        menu.add("Dashboar");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sale");
        menu.add("Customer");
        menu.add("Project");


        //Cap nhat du lieu
        menu.add(3,"Task123");
        menu.set(4, "Report");

        //Xoa du lieu
        menu.remove(3);

        //get gia tri theo chi muc
        //vi tri bat dau la 0
        System.out.println(menu.get(4));

        //Kiem tra du lieu
        System.out.println(menu.contains("Dashboard"));


        //Duyet du lieu kieu arraylist
        for (int i = 0; i<menu.size();i++) {
            System.out.println(menu.get(i));
        }

        //for cai tien
        int j = 0;
        for (String value : menu) {
            System.out.println(menu.get(j));
            j++;
        }

        System.out.println("===========");
        List<String> menu2 = new Stack<>();
        menu2.addAll(menu);//Them nguyen 1 bo data trong menu vao menu2
        for (int i = 0; i<menu2.size();i++) {
            System.out.println(menu2.get(i));
        }


    }
}
