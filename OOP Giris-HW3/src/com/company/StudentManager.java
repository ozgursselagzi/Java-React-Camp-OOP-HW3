package com.company;

public class StudentManager extends Student{
    public void addStudent(Student student){
        System.out.println(student.getFirstName()+" "+student.getSecondName()+" İsimli öğrencinin bilgileri sisteme eklendi.");
    }

    public void removeStudent(Student student){
        System.out.println(student.getFirstName()+" "+student.getSecondName()+" İsimli öğrencinin bilgileri sistemden silindi.");
    }

    public void updateStudent(Student student){
        System.out.println(student.getFirstName()+" "+student.getSecondName()+" İsimli öğrencinin bilgileri sistemde güncellendi.");
    }

    public void createStudentID(Student student){
        System.out.println("Öğrencinin ID Numarası: "+student.getFirstName()+student.getSecondName()+
                student.getFirstName().length()+student.getSecondName().length());
    }
}
