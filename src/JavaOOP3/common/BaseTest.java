package JavaOOP3.common;

public class BaseTest{


    public static void createDriver() {
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public static void closeDriver() {
        System.out.println("Closed browser: " + Constants.browser);
    }

    public static void main(String[] args) {
        createDriver();
        closeDriver();
    }


}
