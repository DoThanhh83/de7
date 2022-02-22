/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package de7;

import java.util.ArrayList;
import java.util.Scanner;

public class De7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n :");
        int n = scanner.nextInt();
        System.out.println("so luong sinh vien khoi A :");
        int soLuongA = scanner.nextInt();
        int soLuongC = n - soLuongA;

        System.out.println("--- nhap sinh vien khoi A ---");
        ArrayList<SvienA> list1 = new ArrayList<>(soLuongA);
        for (int i = 0; i < soLuongA; i++) {
            System.out.println("nhap sv khoi A , thu : "+(i+1));
            SvienA sv = new SvienA();
            sv.nhapthongtin();
            list1.add(sv);

        }

        System.out.println("--- nhap sinh vien khoi C ---");
        ArrayList<SvienC> list2 = new ArrayList<>(soLuongC);
        for (int i = 0; i < soLuongC; i++) {
            System.out.println("nhap sv khoi C ,thu : "+(i+1));
            SvienC sv = new SvienC();
            sv.nhapthongtin();
            list2.add(sv);
        }

        System.out.println("nhung sinh vien dat chi tieu :");
        for (int i = 0; i < soLuongA; i++) {

            int tongdiem = list1.get(i).diemHoa+ list1.get(i).diemLy + 
                    list1.get(i).diemToan ;
            if(tongdiem>20 ) System.out.println(list1.get(i).hoten);
        }
        for (int i = 0; i < soLuongC; i++) {

            int tongdiem = list2.get(i).diemDia+ list2.get(i).diemSu +
                    list2.get(i).diemVan ;
            if(tongdiem>20 ) System.out.println(list2.get(i).hoten);
        }



    }
}