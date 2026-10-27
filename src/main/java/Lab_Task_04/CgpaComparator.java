/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_04;

/**
 *
 * @author codez
 */
import java.util.Comparator;

public class CgpaComparator implements Comparator<Student> {

    // External ordering: CGPA descending
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getCgpa(), s1.getCgpa());
    }
}
