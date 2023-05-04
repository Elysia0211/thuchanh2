/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nganhangacb;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Account {
    private double sotien;
    private int sotk;
    private String tentk;
    private String trangthai;

    public Account() {
    }

    public Account(double sotien, int sotk, String tentk, String trangthai) {
        this.sotien = sotien;
        this.sotk = sotk;
        this.tentk = tentk;
        this.trangthai = trangthai;
    }

    public Account(int sotk, String tentk) {
        this.sotk = sotk;
        this.tentk = tentk;
    }
    
    public Account(double sotien, int sotk, String tentk) {
        this.sotien = sotien=50;
        this.sotk = sotk=999999;
        this.tentk = tentk=null;
       
    }
    
    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public int getSotk() {
        return sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    public void nhap(Scanner sc){
        System.out.println(" Nhap vao so tien");
        sotien =sc.nextDouble();
        System.out.println(" Nhap vao so tai khoan");
        sotk =sc.nextInt();
        System.out.println(" Nhap vao ten tai khoan");
        tentk =sc.nextLine();
        System.out.println(" Nhap vao trang thai");
        trangthai =sc.nextLine();
        
    }
    public void xuat(){
        System.out.println("So tien"+sotien);
        System.out.println("So tai khoan"+sotk);
        System.out.println("Ten tai khoan"+tentk);
        System.out.println("Trang thai"+trangthai);
    }
    private static class Locale {
        private String maNN;
        private String maQG;

        public Locale() {
            
        }

        public Locale(String maNN, String maQG) {
            this.maNN = maNN;
            this.maQG = maQG;
        }
        
    }
    
    @Override
    public String toString() {
        Locale local = new Locale();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String str1 = formatter.format(sotien);
        return "Account{" + "sotien=" + sotien + ", sotk=" + sotk + ", tentk=" + tentk + ", trangthai=" + trangthai + '}';
    }

    public double napTien() {
        Scanner sc = new Scanner(System.in);
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        
        if (nap >= 0) {
            sotien = nap + sotien;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {//ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
    public double rutTien() {
        Scanner sc = new Scanner(System.in);
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        
        if (rut <= (sotien - phi)) {
            sotien = sotien - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
    public double daoHan() {
        double laiSuat = 0.035;
        sotien = sotien + sotien * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return sotien;
    }
 
    
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.printf("%-10d %-20s %-20s \n", sotk, tentk, str1);
    }

    
}
