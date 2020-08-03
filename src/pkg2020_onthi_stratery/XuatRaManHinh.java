/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_onthi_stratery;

import java.util.List;

/**
 *
 * @author HaiNguyen
 */
public class XuatRaManHinh implements IXuat
{
    @Override
    public void Xuli(List<Double> nghiem) 
    {
        System.out.println("Nghiem cua pt la: ");
        
        for(double x:nghiem)
        {
            System.out.println("Nghiem: " + x);
        }
    }
}
