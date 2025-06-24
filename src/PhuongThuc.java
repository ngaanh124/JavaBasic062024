public class PhuongThuc {
    //public khai bao ham
    //void
    //ten ham ko khoang trang ko so

    public double sum; //bien toan cuc
    public double result; //bien toan cuc
    public double res;

    //ham ko tra ve
    public void cong2so() {
        int a = 5;
        int b = 10;
        //int c = a + b;
        sum = a + b;
        System.out.println(sum);
    }

    //ham co tham so
    public void cong2so(int number1, int number2) {
        System.out.println(number1+number2);
    }

    public void loginCRM() {
        System.out.println("Navigate tp URL");
        System.out.println("Enter email and pass");
        System.out.println("CLick login button");
        System.out.println("Verify login success");
    }

    //ham co tra ve phai co return
    public double nhan2so() {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }
    public long nhan3so(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2so();

        //gia tri dong
        phuongThuc.cong2so(30,60);
        phuongThuc.cong2so(40,60);

        System.out.println(phuongThuc.nhan3so(2,5,20)/5);

        System.out.println(phuongThuc.nhan2so());
        phuongThuc.loginCRM();
    }
}
