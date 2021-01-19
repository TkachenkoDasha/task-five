package task3;

import java.time.LocalDate;
import java.time.Period;

public class StudentValidator {

    public void validateStudent(Student student) {
        validateName(student.getName());
        validateSurname(student.getSurname());
        validateDateOfBirth(student.getDateOfBirth());
        validateRecordBookNumber(student.getRecordBookNumber());
    }

    public void validateName(String name) {
        if (name.length() < 2 || name.length() > 15) {
            throw new BadInputException("Please enter a valid name! Name is too short or too long!");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new BadInputException("Please enter a valid name! Only letters are allowed!");
        }
    }

    public void validateSurname(String surname) {
        if (surname.length() < 2 || surname.length() > 20) {
            throw new BadInputException("Please enter a valid surname! Surname is too short or too long");
        }

        if (!surname.matches("[a-zA-Z]+")) {
            throw new BadInputException("Please enter a valid surname! Only letters are allowed!");
        }
    }

    public void validateDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())) {
            throw new BadInputException("Please enter a valid date of birth!");
        }

        if (Period.between(dateOfBirth, LocalDate.now()).getYears() >= 120) {
            throw new BadInputException("Incorrect date, check the input");
        }
    }

    public void validateRecordBookNumber(int recordBookNumber) {
        if (recordBookNumber < 1) {
            throw new BadInputException("Please enter a valid record book number!");
        }
    }
}
