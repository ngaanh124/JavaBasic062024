package Arrays;

public class DemoMang1 {
    public static void main(String[] args) {
        //Khai bao mang rong, chua mang gia tri
        int number1[] = new int[6];

        //gan gia tri cho mang
        number1[0] = 40;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 5;
        number1[4] = 10;
        number1[5] = 10;

        //deflaut cua 1 string la null, int la 0

        //Lay ra do dai cua mang
        System.out.println("Do dai mang: " + number1.length);

        //Lay ra vi tri bat ki
        System.out.println(number1[4]);

        System.out.println("+++++++");
        //Duyet mang de lay gia tri ra
        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i]);
        }

        System.out.println("+++++++");
        //Duyet theo vi tri thu 2
        for (int i = 2; i < 5; i++) {
            System.out.println(number1[i]);
        }


        System.out.println("---------");


        //for cai tien
        for (int number : number1) {
            System.out.println(number);
        }

    }
}
