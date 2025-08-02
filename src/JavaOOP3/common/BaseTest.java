package JavaOOP3.common;

public class BaseTest{


    public static void createDriver() {
        System.out.println("Browser");
        System.out.println("Report");
        System.out.println("Headless");
    }

    public static void closeDriver() {
        System.out.println("Closed browser: " + Constants.browser);
    }

    public static void main(String[] args) {
        createDriver();
        closeDriver();
    }


}
