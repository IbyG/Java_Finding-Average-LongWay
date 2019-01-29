import java.util.Scanner;

public class TestAverage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner kb = new Scanner(System.in);
        double score = 0;

        double mark1 = 0;
        double mark2 = 0;
        double mark3 = 0;
        double mark4 = 0;
        double mark5 = 0;

        for (int i = 1; i <= 5; i++) { //loops asking 5 times for 5 grades
            System.out.println("What is score: " + i);
            score = kb.nextDouble();

            if (score <= 0) { //checks if the user type incorrect input 
                score = checker(score, i); //method that repeats the question until the user inputs the correct statement 
            }

            String grade = determineGrade(score); // this gets abcd or f based on the score given 
            System.out.println(grade); // prints the letter

            switch (i) {
                case 1:
                    mark1 = score;
                    break;
                case 2:
                    mark2 = score;
                    break;
                case 3:
                    mark3 = score;
                    break;
                case 4:
                    mark4 = score;
                    break;
                case 5:
                    mark5 = score;
                    break;
            }


        }

        double average = calcAverage(mark1, mark2, mark3, mark4, mark5);
        System.out.println("The Average is: %" + average);

        kb.close();
    }

    public static double checker(double x, int y) { //checks if the input is above 0 or not validation
        //x is the score inputted
        // y is which score it is from 1-5
        Scanner kb = new Scanner(System.in);
        while (x <= 0) {
            System.out.println("The score should be above 1");

            System.out.println("What is score: " + y);
            x = kb.nextDouble();
        }
        kb.close();
        return (x);
    }

    public static String determineGrade(double x) { //checks grade and returns similar grade letter
        //x is score 
        String grade = "";

        if (x < 60) {
            grade = "F";
        } else if (x < 69) {
            grade = "D";
        } else if (x < 79) {
            grade = "C";
        } else if (x < 89) {
            grade = "B";
        } else {
            grade = "A";
        }

        return (grade);
    }

    public static double calcAverage(double a, double b, double c, double d, double e) { //getting the average of all 5 scores
        // x is the score
        // y is the count in the for loop 

        double averageScore = (a + b + c + d + e) / 5;

        return (averageScore);
    }

}