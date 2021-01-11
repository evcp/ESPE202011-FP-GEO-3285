/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofpentagonwithshort;

/**
 *
 * @author Emilia
 */
public class AreaOfPentagonWithShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short length;
        short apothem;
        short  area;
        
        length = 65;
        apothem = (short) (length/(2*0.73));
        area= (short) (5*apothem*length);
        
       System.out.println("the area " + length + "is equal to--" +area);
    }
    
}
