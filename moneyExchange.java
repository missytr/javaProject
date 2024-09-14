<<<<<<< HEAD
=======
package PACKAGE_NAME;

>>>>>>> dd2941e9cf353a7343e4fcd5b8bfff2068cd2cfd
import java.util.Scanner;
public class moneyExchange {
    public static void main(String[] args) {
        double USD;
        double exchangeRate = 23.500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Đổi tiền USD => VND");
        System.out.print("Vui lòng nhập số USD cần đổi: ");
        USD = sc.nextDouble();
        System.out.println("Số VND sau khi đổi là: " + (USD * exchangeRate) + " VND" );
    }
}
