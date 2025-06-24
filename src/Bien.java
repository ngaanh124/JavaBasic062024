public class Bien {

    String address = "Can Tho"; //Day la bien toan cuc
    static String phone = "0971484592";

    // Ham thu nhat
    public void sayHello() {
        int n = 10; //day la bien local
        System.out.println("gia tri cua n la:" + n);
        System.out.println(address);
    }
    // Ham thu hai
    public  void getInfo() {
       // System.out.println(n);
        System.out.println(address);
    }
    public static void main(String[] args) {
        //cach thuc de goi 1 thanh phan trong 1 class vao ham bat ky
        Bien bien = new Bien();
        System.out.println(bien.address);

       // System.out.println(address);
        System.out.println(phone);
        // day laf ghi chu
        // khai bao bien
        int number1 = 123456;
        int number2 = 789;
        String name = "Nhung";
        String ten = "Linh";
        String email = "admin@example.com";

        // in gia tri cua bien ra man hinh
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(ten);

    }
}
