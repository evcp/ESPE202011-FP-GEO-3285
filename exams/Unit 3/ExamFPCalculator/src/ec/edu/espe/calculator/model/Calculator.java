/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.model;

/**
 *
 * @author Emilia
 */
public class Calculator {
      private String color;
        private String brand;
        private int numberOfKeys;
        private float screenLenght;

    public Calculator(String color, String brand, int numberOfKeys, float screenLenght) {
        this.color = color;
        this.brand = brand;
        this.numberOfKeys = numberOfKeys;
        this.screenLenght = screenLenght;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the numberOfKeys
     */
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    /**
     * @param numberOfKeys the numberOfKeys to set
     */
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    /**
     * @return the screenLenght
     */
    public float getScreenLenght() {
        return screenLenght;
    }

    /**
     * @param screenLenght the screenLenght to set
     */
    public void setScreenLenght(float screenLenght) {
        this.screenLenght = screenLenght;
    }
    
}
