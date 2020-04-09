/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculates;

import interfaces.ICalculate;

/**
 *
 * @author quang
 */
public class CasioCalculates  implements ICalculate
{

    @Override
    public int cong(int s1, int s2) {
        return s1+s2;
    }

    @Override
    public int tru(int s1, int s2) {
        return s1-s2;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nhan(int s1, int s2) {
        return s1*s2;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float chia(int s1, int s2) {
       if(s2!=0)
           return s1/s2;
       return Float.NaN;
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
