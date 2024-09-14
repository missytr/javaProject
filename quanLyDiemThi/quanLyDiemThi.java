package quanLyDiemThi;

import java.util.Objects;
import java.util.Scanner;

public class quanLyDiemThi {
    final static float khuVuc_A = 2;
    final static float khuVuc_B = 1;
    final static float khuVuc_C = 0.5f;

    final static float doiTuong_1 = 2.5f;
    final static float doiTuong_2 = 1.5f;
    final static float doiTuong_3 = 1;

    public static float diemChuan(Scanner scan) {
        float diem;
        System.out.print("Mời nhập điểm chuẩn: ");
        diem = Float.parseFloat(scan.nextLine());
        return diem;
    }

    public static float diem1(Scanner scan) {
        float diem;
        System.out.print("Mời bạn nhập điểm môn thứ nhất: ");
        diem = Float.parseFloat(scan.nextLine());
        return diem;
    }

    public static float diem2(Scanner scan) {
        float diem;
        System.out.print("Mời bạn nhập điểm môn thứ hai: ");
        diem = Float.parseFloat(scan.nextLine());
        return diem;
    }

    public static float diem3(Scanner scan) {
        float diem;
        System.out.print("Mời bạn nhập điểm môn thứ ba: ");
        diem = Float.parseFloat(scan.nextLine());
        return diem;
    }

    public static float tong3Diem (float diem1 , float diem2, float diem3) {
        float diem;
        diem = diem1 + diem2 +  diem3;
        return diem;
    }

    public static int doiTuong (Scanner scan) {
        int chon;
        System.out.println("Nhập đối tượng của thí sinh:");
        System.out.println("1. Đối tượng 1");
        System.out.println("2. Đối tượng 2");
        System.out.println("3. Đối tượng 3");
        System.out.println("0. Không là đối tượng ưu tiên");
        System.out.print("Đối tượng: ");
        chon = Integer.parseInt(scan.nextLine());
        return chon;
    }

    public static float diemDoiTuong (int doiTuong) {
        float diem = 0;
        if (doiTuong == 1) {
            diem = doiTuong_1;
        } else if (doiTuong == 2) {
            diem = doiTuong_2;
        } else if (doiTuong == 3) {
            diem = doiTuong_3;
        }
        return diem;
    }

    public static String khuVuc (Scanner scan) {
        String chon;
        System.out.println("Nhập đối tượng của thí sinh:");
        System.out.println("A. Khu vực A");
        System.out.println("B. Khu vực B");
        System.out.println("C. Khu vực C");
        System.out.println("X. Không là khu vực ưu tiên");
        System.out.print("Khu Vực: ");
        chon = scan.nextLine();
        return chon;
    }

    public static float diemKhuVuc (String khuVuc) {
        float diem = 0;
        if (Objects.equals(khuVuc, "A") || Objects.equals(khuVuc, "a")) {
            diem = khuVuc_A;
        } else if (Objects.equals(khuVuc, "B") || Objects.equals(khuVuc, "b")) {
            diem = khuVuc_B;
        } else if (Objects.equals(khuVuc, "C") || Objects.equals(khuVuc, "c")) {
            diem = khuVuc_C;
        } else if (Objects.equals(khuVuc, "X") || Objects.equals(khuVuc, "x") || khuVuc == null) {
            return diem;
        }
        else {
            System.out.println("Khu vực không hợp lệ hoặc để trống!");
        }
        return diem;
    }

    public static float tongDiem (String khuVuc, int doiTuong, float diem1 , float diem2, float diem3) {
        float diem = 0;
         diem += (tong3Diem(diem1,diem2,diem3) + diemKhuVuc(khuVuc) + diemDoiTuong(doiTuong));
        return diem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float diem1 = diem1(scan);
        float diem2 = diem2(scan);
        float diem3 = diem3(scan);
        String khuVuc = khuVuc(scan);
        int doiTuong = doiTuong(scan);
        float diemChuan = diemChuan(scan);
        float tongDiem = tongDiem(khuVuc, doiTuong, diem1,diem2,diem3);
        if(tongDiem >= diemChuan) {
            System.out.println("Bạn đã đậu với số điểm: " + tongDiem);
        }
        else {
            System.out.println("Bạn đã rớt với số điểm: " + tongDiem);
        }
    }
}
