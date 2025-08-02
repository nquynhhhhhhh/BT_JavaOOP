package JavaOOP3.testcase;

import JavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public static void login() {
        createDriver();
        System.out.println("Step 1: Mở trang login https://cms.anhtester.com/login");
        System.out.println("Step 2: Nhập username");
        System.out.println("Step 3: Nhập password");
        System.out.println("Step 4: Click Remember me");
        System.out.println("Step 5: Click login button");
        closeDriver();
    }

    public static void addCategory() {
        createDriver();
        System.out.println("Step 1: Đăng nhập vào hệ thống");
        System.out.println("Step 2: Click All Category");
        System.out.println("Step 3: Kiểm tra Category hiển thị bao nhiêu items");
        System.out.println("Step 4: Click item Book");
        System.out.println("Step 5: Kiểm tra có đến được trang SBL thành công không");
        closeDriver();
    }

    public static void main(String[] args) {
        login();
        addCategory();
    }

}
