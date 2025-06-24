package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        //khai bao kieu du lieu Set
        //Khong luu duoc du lieu trung lap
        Set<String> menu = new HashSet<>();

        //Them du lieu
        menu.add("Project");
        menu.add("DashBoard");
        menu.add("Customer");
        menu.add("Task");
        menu.add("Sale");
        menu.add("Project");

        System.out.println(menu.contains("Task23456"));
        menu.remove("Sale");
        System.out.println(menu.size());

        System.out.println("Cac phan tu cua Set");
        //"\t" .... "\n" thut vao
        System.out.println("\t" + menu + "\n");

        System.out.println("\n=========");
        //Duyet gia tri trong Set
        //Cach 1: Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }

        System.out.println("\n=========");
        //Cach 2: Show set through for-each
        for (String obj : menu) {
            //println la xuong dong
            System.out.println(obj);
        }
    }

}
