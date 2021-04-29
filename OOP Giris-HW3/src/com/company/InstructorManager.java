package com.company;

public class InstructorManager extends Instructor {
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getSecondName() + " İsimli eğitmenin bilgileri sisteme eklendi.");
    }

    public void removeInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getSecondName() + " İsimli eğitmenin bilgileri sistemden silindi.");
    }

    public void updateInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getSecondName() + " İsimli eğitmenin bilgileri sistemde güncellendi");
    }

    public void createInstructorID(Instructor instructor) {
        System.out.println("Öğrencinin ID Numarası: " +instructor.getExperianceYear() +instructor.getFirstName() + instructor.getSecondName() +
                instructor.getFirstName().length() + instructor.getSecondName().length());
    }
}
