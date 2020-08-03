/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_onthi_stratery;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HaiNguyen
 */
public class NhapTuBanPhim  implements INhap
{

    @Override
    public void NTS(List<Integer> thamso) 
    {
        System.out.println("Nhap danh sach tham so vao phuong trinh:\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tham số: ");
        System.out.println("Nhập a: ");
            int a = scanner.nextInt();
            thamso.add(a);
        System.out.println("Nhập b: ");
            a = scanner.nextInt();
            thamso.add(a);
        System.out.println("Nhập c: ");
            a = scanner.nextInt();
            thamso.add(a);
        
    }
    
}
