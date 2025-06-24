public class SwitchCase {
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

            String browser = "chrome";
            switch (browser) {
                case "chrome":
                    System.out.println("Chay test voi trinh duy chrome");
                    break;
                case "edge":
                    System.out.println("Chay test voi trinh duyet MS Edge");
                    break;
                case "firefox":
                    System.out.println("Chay voi trinh duyt");
                    break;
                default:
                    System.out.println("Chay test voi trinh duyet chrome mac dinh");
                    break;


            }



        }
}
