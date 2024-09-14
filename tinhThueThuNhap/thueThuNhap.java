package tinhThueThuNhap;

import java.util.Scanner;

public class thueThuNhap {
    final static float thue_60 = 0.05f;
    final static float thue_60_120 = 0.1f;
    final static float thue_120_210 = 0.15f;
    final static float thue_210_384 = 0.2f;
    final static float thue_384_624 = 0.25f;
    final static float thue_624_960 = 0.3f;
    final static float thue_960 = 0.35f;

    final static float thueThuNhap_60 = 60 * thue_60;
    final static float thueThuNhap_60_120 = 60 * thue_60_120;
    final static float thueThuNhap_120_210 = 90 * thue_120_210;
    final static float thueThuNhap_210_384 = 174 * thue_210_384;
    final static float thueThuNhap_384_624 = 240 * thue_384_624;
    final static float thueThuNhap_624_960 =336 * thue_624_960;
    
    public static String hoTen (Scanner scan) {
        String hoTen;
        System.out.print("Nhập tên người nộp thuế: ");
        hoTen = scan.nextLine();
        return hoTen;
    }

    public static float tongThuNhap (Scanner scan) {
        float tongThuNhap = 0;
        System.out.print("Nhập vào tổng thu nhập trong năm đơn vị triệu đồng: ");
        tongThuNhap = Float.parseFloat(scan.nextLine());
        return tongThuNhap;
    }

    public static int soNguoiPhuThuoc (Scanner scan) {
        int soNguoiPhuThuoc = 0;
        System.out.print("Nhập số người phụ thuộc: ");
        soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
        return soNguoiPhuThuoc;
    }

    public static float thuNhapChiuThue (float tongThuNhap, int soNguoPhuThuoc) {
        float thuNhapChiuThue = 0;
        thuNhapChiuThue = tongThuNhap - 4 - (soNguoPhuThuoc *  1.6f);
        return thuNhapChiuThue;
    }

    public static float thueThuNhap (float thuNhapChiuThue) {
        float thueThuNhap = 0;
        if (thuNhapChiuThue <= 60) {
            thueThuNhap = thuNhapChiuThue * thue_60;
        } else if (thuNhapChiuThue <= 120) {
            thueThuNhap = thueThuNhap_60 + (thuNhapChiuThue - 60) * thue_60_120;
        } else if (thuNhapChiuThue <= 210) {
            thueThuNhap = thueThuNhap_60 + thueThuNhap_60_120 + (thuNhapChiuThue - 120) * thue_120_210;
        } else if (thuNhapChiuThue <= 384) {
            thueThuNhap = thueThuNhap_60 + thueThuNhap_60_120 + thueThuNhap_120_210 + (thuNhapChiuThue - 210) * thue_210_384;
        } else if (thuNhapChiuThue <= 624) {
            thueThuNhap = thueThuNhap_60 + thueThuNhap_60_120 + thueThuNhap_120_210 + thueThuNhap_210_384 + (thuNhapChiuThue - 384) * thue_384_624;
        } else if (thuNhapChiuThue <= 960) {
            thueThuNhap = thueThuNhap_60 + thueThuNhap_60_120 + thueThuNhap_120_210 + thueThuNhap_210_384 + thueThuNhap_384_624 + (thuNhapChiuThue - 624) * thue_624_960;
        } else {
            thueThuNhap = thueThuNhap_60 + thueThuNhap_60_120 + thueThuNhap_120_210 + thueThuNhap_210_384 + thueThuNhap_384_624 + thueThuNhap_624_960 + (thuNhapChiuThue - 960) * thue_960;
        }
        return thueThuNhap;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hoTen  = hoTen(scan);
        float tongThuNhap = tongThuNhap(scan);
        int soNguoiPhuThuoc = soNguoiPhuThuoc(scan);
        float thuNhapChiuThue = thuNhapChiuThue(tongThuNhap, soNguoiPhuThuoc);
        float thueThuNhap = thueThuNhap(thuNhapChiuThue);
        System.out.println("Số thuế " + hoTen + " phải nộp là: " + thueThuNhap + "triệu đồng");
    }
}
