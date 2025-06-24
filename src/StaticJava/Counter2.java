package StaticJava;

public class Counter2 {
    static int count = 0; // se lay bo nho moi khi khoi tao lai class hhoac goi laiu bien nay

    Counter2() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter2 c1 = new Counter2();//khoi tao lan 1
        Counter2 c2 = new Counter2();//khoi tao lan 2
        Counter2 c3 = new Counter2();//khoi tao lan 3

    }
}
