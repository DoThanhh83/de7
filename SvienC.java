    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
                             */
package de7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SvienC extends Thisinh{
    public int diemVan;
    public int diemSu;
    public int diemDia;

    public SvienC(){
        
    }
    
    public SvienC(String hoten, String ngaysinh , String diachi, int diemVan, 
            int diemSu, int diemDia){
        this.diemDia=diemDia;
        this.diemSu = diemSu;
        this.diemVan = diemVan;
    }

    public int getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(int diemVan) {
        this.diemVan = diemVan;
    }

    public int getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(int diemSu) {
        this.diemSu = diemSu;
    }

    public int getDiemDia() {
        return diemDia;
    }
    @Override
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapthongtin();
         System.out.println("nhap VAn:");
         setDiachi(scanner.nextLine());
         System.out.println("nhap su :");
         setDiachi(scanner.nextLine());
         System.out.println("nhap diem dia:");
         setDiachi(scanner.nextLine());
    
    }
    @Override
     public String toString(){
         return "hoc sinh khoi C :{" +
                 "ten: " + hoten + "ngay sinh:" + ngaysinh + "diachi: "+ diachi
                 + "diem vann:" + diemVan +  "diem dia:" + diemDia + 
                 "diem su:" + diemSu;
}
}