public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d,e,f;
        d = e= f = 0;

        // toan tu so hoc
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println(a++); //a = a+1
        System.out.println(a);//a = 11
        System.out.println("a = " +(a +=5));//a = a +5

        System.out.println(a + b + c);
        System.out.println(a + b * c / 5);

        //toan tu so sanh va logic
        System.out.println("So sanh a > b: " + (a > b));
        System.out.println((a>b) && (b>c)); //and
        System.out.println((a>b) || (b>c)); //or
    }
}
