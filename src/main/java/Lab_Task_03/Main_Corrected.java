/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_03;

/**
 *
 * @author codez
 */
public class Main_Corrected {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle_Corrected();
        ((Rectangle_Corrected) rectangle).setDimensions(5, 10);

        Shape square = new Square_Corrected();
        ((Square_Corrected) square).setSide(5);

        System.out.println(
                "Rectangle Area: " + rectangle.getArea()
        );

        System.out.println(
                "Square Area: " + square.getArea()
        );
    }
}
