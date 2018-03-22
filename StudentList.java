import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a student name: ");
        String inputName = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of student " + inputName + " is: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (isExist == false) System.out.println("Not found " + inputName + " in the list.");
    }
}
