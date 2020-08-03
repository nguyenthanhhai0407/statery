/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_onthi_stratery;

/**
 *
 * @author HaiNguyen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PhuongTrinh pt = new PhuongTrinh();
        
        INhap nhap = new NhapTuBanPhim();
        IXuat xuat = new XuatRaManHinh();
        
        pt.setNhapTS(nhap);
        pt.setXuLi(xuat);
        
        pt.NTS();
        pt.Giai();
        pt.Xuli();
    }
    
}
