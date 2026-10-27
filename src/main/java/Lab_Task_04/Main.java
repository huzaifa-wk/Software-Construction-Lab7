/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_04;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.50));
        students.add(new Student(101, 3.90));
        students.add(new Student(102, 3.70));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Comparable: roll number ascending
        Collections.sort(students);

        System.out.println("\nSorted by Roll Number (Ascending):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Comparator: CGPA descending
        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
