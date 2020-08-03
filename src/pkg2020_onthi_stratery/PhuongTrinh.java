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
public class PhuongTrinh extends Stratery_GPT
{
    public void setNhapTS(INhap nhapTS) 
    {
        this.nhap = nhapTS;
    }

    public void setXuLi(IXuat xuLi) {
        this.xuat = xuLi;
    }

    @Override
    public void NTS() 
    {
        nhap.NTS(thamso);
    }

    @Override
    public void Xuli() 
    {
        xuat.Xuli(nghiem);
    }
    
}
