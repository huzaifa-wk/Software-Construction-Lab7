/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Task_04;

/**
 *
 * @author codez
 */
public class Student implements Comparable<Student> {

    private final int rollNo;
    private final double cgpa;

    public Student(int rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Natural ordering: roll number ascending
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", CGPA: " + cgpa;
    }
}
