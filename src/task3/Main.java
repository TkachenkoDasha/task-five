package task3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("AbdulaAhmetIbnHatab", "P",
                LocalDate.of(1900,10,10), 0);

        StudentValidator studentValidator = new StudentValidator();
        try {
            studentValidator.validateStudent(student);
            System.out.println(student.toString());
        } catch (BadInputException e){
            System.out.println("Bad input: " + e.getMessage());
        }
    }
}
