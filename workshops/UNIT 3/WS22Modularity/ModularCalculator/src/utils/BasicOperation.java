/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Emilia
 */
public class BasicOperation {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float substractTwoNumbers(float minuend, float subtrahend) {
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
    }

    public static float multiplicateTwoNumbers(float multiplying, float multiplier) {
        float multiplication = 0;
        multiplication = multiplying * multiplier;
        return multiplication;

    }

    public static float divideTwoNumbers(float dividend, float divisor) {
        float division = 0;
        division = dividend / divisor;
        return division;
    }
}
