package VongLapFOR;
// vong lap FOR de duyt 1 mang hoac 1 danh sach
public class DemoForDonGian {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i+=2) {
            System.out.println("Xin chao " + i);
            if (i == 20) {
                break;//Thoat khoi vong lap FOR
            }
        }

//        for (int i =1; i<=14; i++) {
//            if (menu.get(i).equals("Dashboard")) {
//                System.out.println("Den duoc dashboard");
//                break; //Thoat khoi vong lap FOR
//            }
//        }
    }
}
