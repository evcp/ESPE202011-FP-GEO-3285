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
public class CellPhone {
    private String brand;
    private String color;
    private int RAM;
    private boolean isNew;
    private boolean isTactil;

    public CellPhone(String brand, String color, int RAM, boolean isNew, boolean isTactil) {
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
        this.isNew = isNew;
        this.isTactil = isTactil;
    }

    public CellPhone() {
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
     * @return the RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM the RAM to set
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
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
     * @return the isTactil
     */
    public boolean isIsTactil() {
        return isTactil;
    }

    /**
     * @param isTactil the isTactil to set
     */
    public void setIsTactil(boolean isTactil) {
        this.isTactil = isTactil;
    }
    
    
    
}
