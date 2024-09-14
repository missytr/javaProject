package tienGrap;

import java.util.Scanner;

public class tinhTienGrab {
    final static float grab_Car_1km = 8000;
    final static float grab_Suv_1km = 9000;
    final static float grab_Black_1km = 10000;

    final static float grab_Car_1km_To_19km = 7500;
    final static float grab_Suv_1km_To_19km = 8500;
    final static float grab_Black_1km_To_19km = 9500;

    final static float grab_Car_Upper_19km = 7000;
    final static float grab_Suv_Upper_19km = 8000;
    final static float grab_Black_Upper_19km = 9000;

    final static float grab_Car_ThoiGianCho = 2000;
    final static float grab_Suv_ThoiGianCho = 3000;
    final static float grab_Black_ThoiGianCho = 3500;

    public static int chonLoaiGrap (Scanner scan) {
        int loai;
        System.out.println("Loại Grap: ");
        System.out.println("1. Grap Car.");
        System.out.println("2. Grap Suv.");
        System.out.println("3. Grap Black.");
        System.out.print("Chon: ");
        loai = Integer.parseInt(scan.nextLine());
        return loai;
    }

    public static float tienKmDau(int loai) {
        float tien;
        if(loai == 1) {
            tien = grab_Car_1km;
        } else if (loai == 2) {
            tien = grab_Suv_1km;
        } else {
            tien = grab_Black_1km;
        }
        return tien;
    }

    public static float tien1Km_19Km(int loai, float soKm) {
        float tien;
        if(loai == 1) {
            tien = grab_Car_1km + (soKm - 1) * grab_Car_1km_To_19km;
        } else if (loai == 2) {
            tien = grab_Car_1km + (soKm - 1) * grab_Suv_1km_To_19km;
        } else {
            tien = grab_Car_1km + (soKm - 1) * grab_Black_1km_To_19km;
        }
        return tien;
    }

    public static float tienupper19Km(int loai, float soKm) {
        float tien;
        if(loai == 1) {
            tien = grab_Car_1km + 18 * grab_Car_1km_To_19km + (soKm - 19) * grab_Car_Upper_19km;
        } else if (loai == 2) {
            tien = grab_Car_1km + 18 * grab_Suv_1km_To_19km + (soKm - 19) * grab_Suv_Upper_19km;
        } else {
            tien = grab_Car_1km + 18 * grab_Black_1km_To_19km + (soKm - 19) * grab_Black_Upper_19km;
        }
        return tien;
    }

    public static float tienCho (int loai, float thoiGianCho) {
        float tien = 0;
        float sophut = 3;
        if(thoiGianCho >=3) {
            float count = Math.round(thoiGianCho / sophut);
            if (loai == 1) {
                tien = grab_Car_ThoiGianCho * count;
            } else if (loai == 2) {
                tien = grab_Suv_ThoiGianCho * count;
            } else {
                tien = grab_Black_ThoiGianCho * count;
            }
        }
            return tien;
    }

    public static float tongTien (int loai, float soKm, float thoiGianCho) {
        float tien;
        if(soKm <= 1) {
            tien = tienKmDau(loai) + tienCho(loai, thoiGianCho);
        } else if (soKm > 1 && soKm <= 19) {
            tien = tien1Km_19Km(loai, soKm) + tienCho(loai, thoiGianCho);
        } else {
            tien = tienupper19Km(loai, soKm) + tienCho(loai, thoiGianCho);
        }
        return tien;
    }
    public static float soKm (Scanner scan) {
        float soKm;
        System.out.print("Nhap so Km: ");
        soKm = Float.parseFloat(scan.nextLine());
        return soKm;
    }

    public static float thoiGianCho (Scanner scan) {
        float thoiGianCho;
        System.out.print("Nhap thoi gian cho: ");
        thoiGianCho = Float.parseFloat(scan.nextLine());
        return thoiGianCho;
    }

    public static void inDongKm1(int loai, float soKm) {
        float donGia;
        if(loai == 1) {
            donGia = grab_Car_1km;
        } else if (loai == 2) {
            donGia = grab_Suv_1km;
        } else {
            donGia = grab_Black_1km;
        }
        if(soKm < 1) {
            System.out.println("KM DAU TIEN \t\t\t\t" + soKm + "\t\t\t" + donGia + "\t\t\t" + donGia);
        }else {
            System.out.println("KM DAU TIEN \t\t\t\t" + 1 + "\t\t\t" + donGia + "\t\t\t" + donGia);
        }

    }

    public static void inDong_1Km_To_19Km(int loai, float soKm) {
        float donGia;
        if(loai == 1) {
            donGia = grab_Car_1km_To_19km;
        } else if (loai == 2) {
            donGia = grab_Suv_1km_To_19km;
        } else {
            donGia = grab_Black_1km_To_19km;
        }
        inDongKm1(loai,soKm);
        if(soKm < 19) {
            System.out.println("TU 2KM TOI " + soKm + "KM\t\t\t\t" + (soKm-1) + "\t\t" + donGia + "\t\t\t" + donGia * (soKm - 1));
        }else {
            System.out.println("TU 2KM TOI 19KM\t\t\t\t" + (soKm-1) + "\t\t" + donGia + "\t\t\t" + donGia * (soKm - 1));
        }
    }
    public static void inDong_Upper_19Km(int loai, float soKm) {
        float donGia;
        if(loai == 1) {
            donGia = grab_Car_Upper_19km;
        } else if (loai == 2) {
            donGia = grab_Suv_Upper_19km;
        } else {
            donGia = grab_Black_Upper_19km;
        }
        inDong_1Km_To_19Km(loai,soKm);
        System.out.println("TU 19KM TOI " + soKm + "KM\t\t\t" + (soKm-19) + "\t\t" + donGia + "\t\t\t" + donGia * (soKm - 19));
    }

    public static void inDong_thoiGianCho(int loai, float thoiGianCho) {
        float donGia;
        if(loai == 1) {
            donGia = grab_Car_ThoiGianCho;
        } else if (loai == 2) {
            donGia = grab_Suv_ThoiGianCho;
        } else {
            donGia = grab_Black_ThoiGianCho;
        }
        float tienCho = tienCho(loai,thoiGianCho);
        System.out.println("THOI GIAN CHO\t\t\t\t" + thoiGianCho + "\t\t" + donGia + "\t\t\t" + tienCho);
    }

    public static void inchitiet (int loai, float soKm, float thoiGianCho) {
        System.out.println("=============================== HOA DON CHI TIET ===============================");
        System.out.println("CHI TIET\t\t\t\tSU DUNG\t\t\tDON GIA\t\t\tTHANH TIEN");
        if(soKm <= 1) {
            inDongKm1(loai,soKm);
        } else if (soKm > 1 && soKm <= 19) {
            inDong_1Km_To_19Km(loai,soKm);
        } else {
            inDong_Upper_19Km(loai,soKm);
        }
        inDong_thoiGianCho(loai,thoiGianCho);
        float tongtien = tongTien(loai,soKm,thoiGianCho);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTHANH TIEN: " + tongtien);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chonLoaiGrap = chonLoaiGrap(scan);
        float soKm = soKm(scan);
        float thoiGianCho = thoiGianCho(scan);
        System.out.println("Tong tien phai tra cho chuyen di la: " + tongTien(chonLoaiGrap, soKm, thoiGianCho));
        inchitiet(chonLoaiGrap, soKm, thoiGianCho);
    }
}
