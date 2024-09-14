import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Tính trung bình năm số cần nhập");
        System.out.print("Vui lòng nhập số thứ nhất: ");
        a = sc.nextInt();
        System.out.print("Vui lòng nhập số thứ hai: ");
        b = sc.nextInt();
        System.out.print("Vui lòng nhập số thứ ba: ");
        c = sc.nextInt();
        System.out.print("Vui lòng nhập số thứ bốn: ");
        d = sc.nextInt();
        System.out.print("Vui lòng nhập số thứ năm: ");
        e = sc.nextInt();
        System.out.println("Trung bình của năm số nhập là: " + (float)(a+b+c+d+e)/5);
    }
}