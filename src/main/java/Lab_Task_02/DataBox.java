/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_02;

/**
 *
 * @author codez
 * @param <T>
 */
public class DataBox<T> {
    
    private final T data;

    public DataBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
