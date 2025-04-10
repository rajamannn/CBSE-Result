package com.company;
import java.util.Scanner;

public class Result_in_cgpa_and_percentage
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);

        System.out.print("Enter the English marks: ");
        int English = scan.nextInt();
        System.out.print("Enter the Physics marks: ");
        int Physics = scan.nextInt();
        System.out.print("Enter the Workshop marks: ");
        int Workshop = scan.nextInt();
        System.out.print("Enter the Programming marks: ");
        int Programming = scan.nextInt();
        System.out.print("Enter the BEE marks: ");
        int BEE = scan.nextInt();
        System.out.print("Enter the Mathematics marks: ");
        int Mathematics = scan.nextInt();
        System.out.print("Enter the Digital Learning marks: ");
        int Dl = scan.nextInt();
        System.out.print("Enter the FTW marks: ");
        int FTW = scan.nextInt();
        System.out.println();
        float totalMarks = (English+Physics+Workshop+Programming+BEE+Mathematics+Dl+FTW);

        float percentage = ((totalMarks)/800.0f)*100;
        System.out.println("Total Percentage: ");
        System.out.println(percentage);
        float cgpa =(totalMarks)/80;
        System.out.println("Total Cgpa: ");
        System.out.println(cgpa);

    }
}
