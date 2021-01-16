/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03interations;

/**
 *
 * @author Emilia
 */
public class HW03Interations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i=0;
        System.out.println("=== This is a while loop from 1 to 10===");
        while (i<10){
            System.out.println("i --" +(i+1));
            i++;
        }
        
      System.out.println("Multiplication Table : 10"); 
       int top=12;
       int product=0;
       int table =10;
       for(int j =1; j<=top; j++ ){
           product = table * j;
           System.out.println("10 * " + "=" + product);
       }  
       
        System.out.println("Rest : 10 "); 
        int stop=10;
        int rest=0;
        for(int j=1; j<=stop;j++){
            rest= stop - j;
            System.out.println("10 -" +j + "=" + rest);
        
        
                
    }
  }     
}
