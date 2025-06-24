public class SwitchCase2 {
        public static void main(String[] args) {
            int number = 40;

            switch (number) {
                case 10:
                    System.out.println("10");
                    break;//thoat khoi vong switch
                case 20:
                    System.out.println("20");
                    break;
                case 30:
                    System.out.println("30");
                    break;
                default:
                    System.out.println("Not in 10, 20 or 30");
            }

            String browser = "FireFox";
            //ham toLowerCase dung chuyen chuoi ve chu thuong
            //ham toLowerCase dung chuyen chuoi ve chu in hoa
            //Ham trim dung de cat bo khoang trang 2 dau cua chuoi
            switch (browser.toLowerCase().trim()) {
                case "chrome":
                    System.out.println("Chay test voi trinh duy chrome");

                case "edge":
                    System.out.println("Chay test voi trinh duyet MS Edge");

                case "firefox":
                    System.out.println("Chay voi trinh duyet firefox");

                default:
                    System.out.println("Chay test voi trinh duyet chrome mac dinh");
                    break;


            }




        }
}
