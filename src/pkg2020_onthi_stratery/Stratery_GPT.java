/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_onthi_stratery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HaiNguyen
 */
public abstract class Stratery_GPT 
{
    List<Integer> thamso = new ArrayList<>();
    List<Double> nghiem = new ArrayList<>();
    
    INhap nhap;
    IXuat xuat;
    
    public abstract void NTS();
    public void Giai()
    {
        double delta = (thamso.get(1) * thamso.get(1)) - 4 * thamso.get(0) * thamso.get(2);
        if(delta <0)
        {
            System.out.println("Pt vo nghiem");
        }
        else
        {
            if(delta == 0)
            {
                double x = -thamso.get(1) / 2* thamso.get(0);
                nghiem.add(x);
            }
            else
            {
                double x = -thamso.get(1) + Math.sqrt(delta) / 2* thamso.get(0);
                    nghiem.add(x);
                x = -thamso.get(1) - Math.sqrt(delta) / 2* thamso.get(0);
                    nghiem.add(x);
            }
        }
    }
    public abstract void Xuli();
    
    
}
