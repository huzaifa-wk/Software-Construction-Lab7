/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_03;

/**
 *
 * @author codez
 */
public class Main {

    public static void main(String[] args) {

        Rectangle shape = new Square();

        shape.setDimensions(5, 10);

        System.out.println("Area: " + shape.getArea());
    }
}
