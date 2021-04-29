package com.company;

public class Main {

    public static void main(String[] args) {
        // Java & React Kampı 3.Gün Ödev Kodları

        User user = new User();     // Referans oluşturma
        Student student = new Student();
        Instructor instructor = new Instructor();
        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        user.setFirstName("'İsim'");     //Değerleri atama
        user.setSecondName("'SOYİSİM'");
        user.setEmail("emailadresi@gmail.com");

           System.out.println("Kullanıcı adı: "+user.getFirstName());
           System.out.println("Kullanıcı soyadı :"+user.getSecondName());
           System.out.println("Kullanıcı e-mail adresi :"+user.getEmail());

           userManager.addUser(user);     //Metot çağırma
           userManager.removeUser(user);
           userManager.updateUser(user);
           System.out.println("--------------------------------------------------------------------");

        student.setFirstName("Özgür");
        student.setSecondName("SELAĞZI");
        student.setEmail("slgzozgr@gmail.com");
        student.setSectionName("Java & React Yazılım Geliştirme Kampı");

           System.out.println("Öğrenci adı: "+student.getFirstName());
           System.out.println("Öğrenci soyadı: "+student.getSecondName());
           System.out.println("Öğrenci email adresi: "+student.getEmail());
           System.out.println("Seçilen ders adı: "+student.getSectionName());
           studentManager.createStudentID(student);

           studentManager.addStudent(student);     //Metot çağırma
           studentManager.removeStudent(student);
           studentManager.updateStudent(student);
           System.out.println("--------------------------------------------------------------------");

        instructor.setFirstName("Engin");
        instructor.setSecondName("DEMİROĞ");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setExperianceYear("15");
        instructor.setWorkingInstitution("Kodlama.io");

        System.out.println("Eğitmen adı: "+instructor.getFirstName());
        System.out.println("Eğitmen soyadı: "+instructor.getSecondName());
        System.out.println("Eğitmen email adresi: "+instructor.getEmail());
        System.out.println("Eğitmenin tecrübesi: "+instructor.getExperianceYear());
        System.out.println("Eğitmenin çalıştığı kurum: "+instructor.getWorkingInstitution());
        instructorManager.createInstructorID(instructor);

        instructorManager.addInstructor(instructor);  //Metot çağırma
        instructorManager.removeInstructor(instructor);
        instructorManager.updateInstructor(instructor);
        System.out.println("--------------------------------------------------------------------");
    }
}
