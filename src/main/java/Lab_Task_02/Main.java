/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_02;

/**
 *
 * @author codez
 */
public class Main {

    public static void main(String[] args) {

        // DataBox for student name
        DataBox<String> nameBox
                = new DataBox<>("Huzaifa");

        // DataBox for student ID
        DataBox<Integer> idBox
                = new DataBox<>(12345);

        // Display stored data
        System.out.println("Student Name: "
                + nameBox.getData());

        System.out.println("Student ID: "
                + idBox.getData());
    }
}
