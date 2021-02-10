/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

import static javafx.scene.input.KeyCode.F;

/**
 *
 * @author Emilia
 */
public class WS12LIBRARIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //if we have Math Library
        //we import and use it
         //IF WE HAVE THE MATH LIBRARY
        //WE IMPORT AND USE IT
        
        float squareRoot=0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue;
        
       
        number = 9; //squereRoot = ? -> 3
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
        
        number = 49; // ? 7 System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
        power=
        number = 5; //? 2.23...
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
       
        base = 3;
        exponent = 2;
        //power = 9?
        power = (float)Math.pow(base,exponent);
        System.out.println(base + " ^ " +exponent+ " = " +power) ;

        base = 2;
        exponent = 4;
        //power = 16 ?
        power = (float)Math.pow(base,exponent);
          System.out.println(base + " ^ " +exponent+ " = " +power) ;
        
        base = 78;
        exponent = 5;
        //calculator 78^5
        //2887174368
        power = (float)Math.pow(base,exponent);
          System.out.println(base + " ^ " +exponent+ " = " +power) ;
         
          absoluteValue=computeAbsoluteValue( number);
          System.out.println("absolut value of-" +number+ "is" +absoluteValue);
         
    
         }
    private static float computeAbsoluteValue(float number){
     if (number<0){
         return -number;
     }else{
        return number;
     }
    }
}

     
     
