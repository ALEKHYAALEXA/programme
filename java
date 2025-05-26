
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
          String name;
          int rollNumber;
          float marks1, marks2, marks3;
          float total, average;
          char result;
          char grade;

          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter student name: ");
        name = scanner.nextLine();

          System.out.print("Enter student rollnumber: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter marks in subject 1: ");
        marks1 = scanner.nextFloat();

        System.out.print("Enter marks in subject 2: ");
        marks2 = scanner.nextFloat();

        System.out.print("Enter marks in subject 3: ");
        marks3 = scanner.nextFloat();

        total = marks1 + marks2 + marks3;
        average = total / 3;
        System.out.printf("Average   : %.2f\n", average);

        if (average >= 40)
        {
            result = 'P';
        }
        else 
        {
             result = 'F';
        }
        
        if(average >= 90)
        {
            grade ='A';
        }
        else if(average >= 80 && average <= 89)
        {
            grade ='B';
        }
        else if(average >= 70 && average <= 79)
        {
            grade ='C';
        }
        else if(average >= 60 && average <= 69)
        {
            grade ='D';
        }
        else 
        {
            grade ='F';
        }
        System.out.println("\n--- Student Report ---");
        System.out.println("Name      : " + name);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Marks 1   : " + marks1);
        System.out.println("Marks 2   : " + marks2);
        System.out.println("Marks 3   : " + marks3);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("status     : " + result);
        System.out.println("grade     : " + grade);

        scanner.close();
        


    }
        


}
