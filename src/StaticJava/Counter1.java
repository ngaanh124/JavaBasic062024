package StaticJava;

public class Counter1 {
    static int count = 0; // se lay bo nho moi khi khoi tao lai class hhoac goi laiu bien nay

    Counter1() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter1 c1 = new Counter1();//khoi tao lan 1
        Counter1 c2 = new Counter1();//khoi tao lan 2
        Counter1 c3 = new Counter1();//khoi tao lan 3

    }
}
