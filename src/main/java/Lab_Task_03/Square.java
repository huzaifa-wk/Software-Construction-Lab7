/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_03;

/**
 *
 * @author codez
 */
public class Square extends Rectangle {

    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException(
                    "Square width and height must be equal!"
            );
        }

        this.w = w;
        this.h = h;
    }
}
