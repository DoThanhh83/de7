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
public class Thisinh {
    public String hoten ; 
    public String ngaysinh;
    public String diachi ;
    
    public Thisinh() 
    {}
    
    public Thisinh(String hoten, String ngaysinh , String diachi ){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
       

    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
     public void nhapthongtin(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhap ho ten:");
         setHoten(scanner.nextLine());
          System.out.println("nhap ngay sinh:");
         setNgaysinh(scanner.nextLine());
          System.out.println("nhap dia chi:");
         setDiachi(scanner.nextLine());
         
     }
@Override    
     public String toString(){
         return "{" +
                 "ten: " + hoten + "ngay sinh:" + ngaysinh + "diachi: "+ diachi;
                
     }
}
