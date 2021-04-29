package com.company;

public class Instructor extends User{
    private String experianceYear;
    private String workingInstitution;

    public String getExperianceYear() {
        return experianceYear;
    }

    public void setExperianceYear(String experianceYear) {
        this.experianceYear = experianceYear;
    }

    public String getWorkingInstitution() {
        return workingInstitution;
    }

    public void setWorkingInstitution(String workingInstitution) {
        this.workingInstitution = workingInstitution;
    }
}
