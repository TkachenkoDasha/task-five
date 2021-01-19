package task3;

import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int recordBookNumber;

    public Student(String name, String surname, LocalDate dateOfBirth, int recordBookNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.recordBookNumber = recordBookNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", recordBookNumber=" + recordBookNumber +
                '}';
    }
}
