package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMManager atmManager = new ATMManager();
        System.out.println("Vui lòng điền username và password");
        Scanner scanner = new Scanner(System.in);
        User user = null;
        do {
            System.out.println("Username");
            String username = scanner.nextLine();
            System.out.println("Password");
            String password = scanner.nextLine();
            user = atmManager.getUserByUserNameAndPassword(username, password);
            if (user == null) {
                System.out.println("Đăng nhập thất bại, vui lòng thử lại");
            }
        } while (user == null);

        //Login thanh cong
        do {
            System.out.println("Vui long chon");
            System.out.println("1. Rut tien");
            System.out.println("2. Truy van tai khoan");
            System.out.println("3. Thoát");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Bạn chọn rút tiền");
                    System.out.println("Vui lòng nhập số tiền cần rút");
                    float amount = scanner.nextFloat();
                    boolean result = atmManager.withdraw(user, amount);
                    if (result) {
                        System.out.println("Rút tiền thành công");
                    } else {
                        System.out.println("Rút tiền thất bại");
                    }
                    break;

                case 2:
                    System.out.println("Bạn chọn truy vấn tài khoản");
                    System.out.println("Tên TK là" + user.getUsername());
                    System.out.println("Số dư của bạn là: " + user.getAmount());
                    break;

                default:
                    return;
            }
        } while (true);
    }
}
