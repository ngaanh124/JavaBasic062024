package StaticJava;

public class LoginPage {
    public static void main(String[] args) {
        WebUI.openURL("https://demoQA");
        WebUI.setText(WebUI.email);
        WebUI.setText(WebUI.pass);
        WebUI.clickElement("");
    }
}
