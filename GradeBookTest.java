package Chapter7;

public class GradeBookTest {

    public static void main(String[] args) {

        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);

        System.out.println("Welcome to the gradebook for "+myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }

}