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
public class SvienA extends Thisinh{
    public int diemToan ;
    public int diemLy ; 
    public int diemHoa ; 
    
    
    public SvienA(){
        
    }
    
    public SvienA (String hoten , String ngaysinh, String diachi , int diemToan,
            int diemLy, int diemHoa){
        this.diemHoa = diemHoa ;
        this.diemLy= diemLy;
        this.diemToan = diemToan;
        
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
    
         super.nhapthongtin();
         
         System.out.println("nhap hoa:");
         setDiachi(scanner.nextLine());
         System.out.println("nhap ly :");
         setDiachi(scanner.nextLine());
         System.out.println("nhap diem toan:");
         setDiachi(scanner.nextLine());
    }
@Override    
     public String toString(){
         return "hoc sinh khoi A :{" +
                 "ten: " + hoten + "ngay sinh:" + ngaysinh + "diachi: "+ diachi
                 + "diem toan:" + diemToan +  "diem hoa:" + diemHoa + 
                 "diem Ly:" + diemLy;
                
     }
}
