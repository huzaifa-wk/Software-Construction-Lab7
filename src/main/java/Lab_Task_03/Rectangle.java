/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_03;

/**
 *
 * @author codez
 */
public class Rectangle {
 
    
    protected int w;
    protected int h;

    public void setDimensions(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getArea() {
        return w * h;
    }
}
