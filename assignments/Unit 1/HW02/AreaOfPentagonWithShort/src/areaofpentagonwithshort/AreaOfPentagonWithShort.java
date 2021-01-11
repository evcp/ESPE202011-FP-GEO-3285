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
        int  area;
        
        length = 54;
        apothem = 12;
        area=(5*length*apothem)/2;
        
       System.out.println("the area " + 5 + "*" + length + "*" + apothem + "/"+ 2 + "is equal to--" +area);
    }
    
}
