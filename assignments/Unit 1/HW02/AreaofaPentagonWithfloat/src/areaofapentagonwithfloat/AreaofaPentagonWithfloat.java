/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofapentagonwithfloat;

/**
 *
 * @author Emilia
 */
public class AreaofaPentagonWithfloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float length;
        float apothem;
        float area;
        
        length = 5.4f;
        apothem = 0.5f;
        area=(5*length*apothem)/2;
        
       System.out.println("the area " + 5 + "*" + length + "*" + apothem + "/"+ 2 + "is equal to--" +area);
    }
    
}
