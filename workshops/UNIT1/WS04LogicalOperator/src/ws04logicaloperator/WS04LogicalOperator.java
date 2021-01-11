/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04logicaloperator;

/**
 *
 * @author Emilia
 */
public class WS04LogicalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 18;
        if (x != 10) {
            System.out.println("x is equals to 18");
        } else {
            System.out.println("x is NOT equal to 18");
        }

        boolean y = x != 10;
        System.out.println("x != 18 --> " + (y));
        System.out.println("x == 18 --> " + (x == 18));
        System.out.println("x = 18 -->   " + (x = 18));
        System.out.println("x > 18 -->  " + (x > 18));
        System.out.println("x >= 18 --> " + (x >= 18));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 18;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 18;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Emilia Calvache AND TRUTH TABLE odd numbers -> &&  even numbers ->||");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p= true;
        q= false;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
          
        p= false;
        q= true;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));  
          
        p= false;
        q= false;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));   
        
    }
    
}
