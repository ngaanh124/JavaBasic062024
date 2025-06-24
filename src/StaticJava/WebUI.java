package StaticJava;

public class WebUI {
    //luu bien toan cuc
    public static  String url = "https://demoQA";
    public static  String email = "";
    public static  String pass = "";
    public static void openURL(String url) {
        System.out.println(url);
    }

    public static void clickElement(String elementName) {
        System.out.println("Click element: " + elementName);
    }

    public  static void  setText(String text) {
        System.out.println("Set text: " + text);
    }

    public static String getElementText(String elementName) {
        return  "text";
    }

    public static void main(String[] args) {
        openURL(url);
        setText(email);
        setText(pass);
        clickElement("Login button");
    }


}
