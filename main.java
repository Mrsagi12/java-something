import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void q1(){
        // 1
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter random number: ");
        Double number = scan.nextDouble();

        if(number > 0){
            System.out.println("The number is positive");
        }
        else if(number < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is 0");
        }
        System.out.println();

        again();
    }

    public static void q2(){
        // 2
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        Double number1 = scan.nextDouble();

        System.out.println("Enter the second number: ");
        Double number2 = scan.nextDouble();

        if(number1 > number2){
            System.out.println(number2+" Is the smallest number");
        }
        else if(number1 < number2){
            System.out.println(number1+" Is the smallest number");
        }
        else{
            System.out.println("The numbers are equal");
        }
        System.out.println();

        again();
    }

    public static void q3(){
        // 3
        double x1, v1, x2, v2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance of the first cyclist: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the speed of the first cyclist: ");
        v1 = scanner.nextDouble();

        System.out.println("Enter the distance of the second cyclist: ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the speed of the second cyclist: ");
        v2 = scanner.nextDouble();

        double t1 = x1 / v1;
        double t2 = x2 / v2;

        if (t1 < t2) {
            System.out.println("The first cyclist arrives at the destination faster");
        } else if (t2 < t1) {
            System.out.println("The second cyclist arrives at the destination faster");
        } else {
            System.out.println("Both cyclists arrive at the destination at the same time");
        }

        again();
    }

    public static void q4(){
        // 4
        Scanner scanner = new Scanner(System.in);

        int grade1, grade2, grade3;
        float averageGrade;
        System.out.println("Enter the first student grade");
        grade1 = scanner.nextInt();
        System.out.println("Enter the second student grade");
        grade2 = scanner.nextInt();
        System.out.println("Enter the third student grade");
        grade3 = scanner.nextInt();
        System.out.println();
        averageGrade = (grade1+grade2+grade3) / 3;
        System.out.println("average grade: " + averageGrade);

        again();
    }

    public static void q5(){
        // 5
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Enter the first number: ");
        n1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        n2 = scanner.nextDouble();

        System.out.println("Enter the tired number: ");
        n3 = scanner.nextDouble();

        double min = Math.min(Math.min(n1, n2), n3);

        System.out.println("The smallest number is: "+min);

        again();
    }

    public static void again() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to choose again? (Y/N): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            main(null);

        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Goodbyeeeeeeeee");

        } else {
            System.out.println("Invalid choice, Please enter Y or N.");
            again();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] list = {"q1", "q2", "q3", "q4", "q5"};

        System.out.println("Choose the question you want to check (q1, q2, q3, q4, q5): ");
        String qes = scanner.nextLine();

        boolean isValidQuestion = false;

        for (String question : list) {
            if (qes.equals(question)) {
                isValidQuestion = true;
                break;
            }
        }

        if (!isValidQuestion) {
            System.out.println("Please enter one of the following: " + String.join(", ", list));
            System.out.println("=======================================");
            main(null);
        } else {
            switch (qes) {
                case "q1":
                    q1();
                    break;
                case "q2":
                    q2();
                    break;
                case "q3":
                    q3();
                    break;
                case "q4":
                    q4();
                    break;
                case "q5":
                    q5();
                    break;
            }
        }
    }
}
