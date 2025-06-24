package DieuKienIFELSE;

public class DemoIF {
    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String header = "Login CMS Page";

        //so sanh bang trong chuoi dung ham equal()
        //so sanh chua trong chuoi dung ham contains()
        if ((age > 18) && address.equals("Ha Noi")) {
            System.out.println("Di nghia vu QS");
        }

        if (header.contains("Login")) {
            System.out.println("Da den duoc trang login");
        }
    }


}
