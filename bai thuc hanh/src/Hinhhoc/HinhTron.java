package Hinhhoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    
    public float BanKinh;
    public HinhTron() {
        Ten = "Hinh Tron ";
    }
    public void NhapBanKinh() {
        System.out.print("Nhap Ban Kinh = ");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextFloat();
        sc.close();
    }
    public void TinhChuVi() {
        ChuVi = 2*Pi*BanKinh;
    }

}