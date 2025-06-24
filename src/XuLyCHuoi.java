public class XuLyCHuoi {
    public static void main(String[] args) {

        String s1 = "Toi ten laf abc, abc la mot nguoi phu nu";
        String s2 = "Hi hi";

        //Cat chuoi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(5,10));

        //Ghep chuoi
        System.out.println(s1 + " " + s2);

        //Chuyen kieu in hoa thuong
        System.out.println(s2.toLowerCase());//thuong
        System.out.println(s2.toUpperCase());//in hoa

        //Xoa ki tu trang 2 dau
        String s3 = " Test Automation";
        System.out.println(s3.trim());

        //Do dai chuoi
        System.out.println("Do dai chuoi: " + s2.length());

        //Tim kiem ki tu
        System.out.println("Tim kim thu tu ki tu: " + s1.charAt(6));

        //Tim kim vi tri
        System.out.println(s1.indexOf("oi"));

        //so sanh chuoi
        //+so sanh bang
        String s4 = "Test Automation";
        String s5 = "Test automation";
        System.out.println("So sanh bang: " + s4.equals(s5));

        //+so sanh chua
        System.out.println("So sanh chua: " + s4.contains("Auto123"));

        //So sanh bo qua hoa thuong
        System.out.println(s4.equalsIgnoreCase(s5));

    }

}
