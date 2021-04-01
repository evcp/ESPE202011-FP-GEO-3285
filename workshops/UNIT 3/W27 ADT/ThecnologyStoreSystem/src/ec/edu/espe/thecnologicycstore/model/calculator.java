/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.thecnologicycstore.model;

/**
 *
 * @author Emilia
 */
public class calculator {
    private String brand;
    private String color;
    private int keys;
    private boolean isNew;
    private boolean isScientific;

    public calculator(String brand, String color, int RAM, boolean isNew, boolean isTactil) {
        this.brand = brand;
        this.color = color;
        this.keys = RAM;
        this.isNew = isNew;
        this.isScientific = isTactil;
    }

    public calculator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the keys
     */
    public int getRAM() {
        return keys;
    }

    /**
     * @param RAM the keys to set
     */
    public void setRAM(int RAM) {
        this.keys = RAM;
    }

    /**
     * @return the isNew
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * @param isNew the isNew to set
     */
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * @return the isScientific
     */
    public boolean isIsTactil() {
        return isScientific;
    }

    /**
     * @param isTactil the isScientific to set
     */
    public void setIsTactil(boolean isTactil) {
        this.isScientific = isTactil;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
