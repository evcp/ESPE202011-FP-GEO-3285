/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW12TAXES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        float base;
        float percentage;
        float total;
        float IVA;
        float income;
        float outlay;
        float NetIncome;
        float taxablebase;
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float cash;
        float tax;
        float remainder;
        float shop;

        Scanner input = new Scanner(System.in);
        System.out.println("----IVA CALCULATOR -----");
        System.out.println("Enter the subtotal--");
        base = getIVA(input);

        System.out.println("=======================");

        System.out.println("INCOME TAX CALCULATOR");
        System.out.println("Enter income");
        income = input.nextFloat();
        System.out.println("outlay");
        outlay = input.nextFloat();
        taxablebase = income - outlay;

        if (taxablebase <= 11212) {
            getTax(taxablebase);

        } else if (taxablebase > 11212 && taxablebase <= 14285) {

            getTax1(taxablebase);

        } else if (taxablebase > 14285 && taxablebase <= 17854) {

            getTax2(taxablebase);

        } else if (taxablebase > 17854 && taxablebase <= 21442) {

            getTax3(taxablebase);

        } else if (taxablebase > 21442 && taxablebase <= 42874) {

            getTax4(taxablebase);

        } else if (taxablebase > 42874 && taxablebase <= 64297) {

            getTax5(taxablebase);

        } else if (taxablebase > 64297 && taxablebase <= 85729) {

            getTax6(taxablebase);

        } else if (taxablebase > 85729 && taxablebase <= 114288) {

            getTax7(taxablebase);

        } else if (taxablebase > 114288) {

            getTax8(taxablebase);

            System.out.println("BADGE CALCULATOR");
            System.out.println("Enter AMOUNT YOU WANT TO SEND");
            cash = input.nextFloat();
            if (cash > 1200) {
                remainder = getCash(cash);
                System.out.println("The remainder " + remainder);

                System.out.println("Enter AMOUNT YOU WANT TO SEND");
                shop = input.nextFloat();
                if (shop > 5017.33) {
                    tax = getShop(shop);
                    System.out.println("The remainder " + tax);

                }

            }
        }

    }

    private static float getShop(float shop) {
        float tax;
        tax = (shop - 5017.33F) * 0.05F;
        return tax;
    }

    private static float getCash(float cash) {
        float remainder;
        remainder = (cash - 1200) * 0.05F;
        return remainder;
    }

    private static void getTax8(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 22366;
        SurplusFractionTax = 114288;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.35F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax7(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 13798;
        SurplusFractionTax = 85729;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.30F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax6(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 8440;
        SurplusFractionTax = 64297;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.25F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax5(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 4156;
        SurplusFractionTax = 42874;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.20F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax4(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 941;
        SurplusFractionTax = 21442;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.15F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax3(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 511;
        SurplusFractionTax = 17854;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.12F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax2(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 154;
        SurplusFractionTax = 14285;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.10F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax1(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 0;
        SurplusFractionTax = 11212;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.05F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
    }

    private static void getTax(float taxablebase) {
        float SurplusFractionTax;
        float difference;
        float valuepercentage;
        float resulttax;
        float basicfraccion = 0;
        SurplusFractionTax = 0;
        difference = taxablebase - SurplusFractionTax;
        valuepercentage = difference * 0.0F;
        resulttax = valuepercentage + basicfraccion;
        System.out.println("The Income Tax is-- " + resulttax);
        System.out.println("IN THIS CASE THERE IS´NT TAX");
    }

    public static float getIVA(Scanner input) {
        float base;
        float IVA;
        base = input.nextFloat();
        if (base > 100) {
            base = (float) (base + (base * 0.12));
        }
        IVA = (float) (base * 0.12);
        System.out.println("The IVA is--" + IVA);
        base = (float) (base + IVA);
        System.out.println("The total is--" + base);
        return base;

    }
}
