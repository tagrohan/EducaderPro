package com.luqidoproit.educaderpro;

public class pojoSubject {
    String id;
    String subjectCode;
    String SubjectName;
    String branchCode;
    String year;

    public pojoSubject() {
    }

    public pojoSubject(String id, String subjectCode, String subjectName, String branchCode, String year) {
        this.id = id;
        this.subjectCode = subjectCode;
        SubjectName = subjectName;
        this.branchCode = branchCode;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "pojoSubject{" +
                "id='" + id + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                ", SubjectName='" + SubjectName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
