package com.company;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Student S1 = new Student();
        Student S2 = new Student();

        System.out.println("enter the name of student 1");
        Scanner sc = new Scanner(System.in);
        String S1name = sc.nextLine();


        System.out.println("enter Roll number of student 1");
        Scanner sc1 = new Scanner(System.in);
        int S1RollNo = sc1.nextInt();


        System.out.println("enter the marks of student 1");
        Scanner sc2 = new Scanner(System.in);
        float S1marks = sc2.nextFloat();
        if(S1marks<0)
        {
            S1marks=0;
        }


        System.out.println("enter the attendance of student 1 in percentage");
        Scanner sc3 = new Scanner(System.in);
        int S1attendance = sc3.nextInt();
        if(S1attendance>75)
        {
            S1marks=(S1marks)+S1marks/10;
        }


        System.out.println("enter the name of student 2");
        Scanner sc4 = new Scanner(System.in);
        String S2name = sc4.nextLine();


        System.out.println("enter the Roll number of student 2");
        Scanner sc5 = new Scanner(System.in);
        int S2RollNo = sc5.nextInt();


        System.out.println("enter the marks of student 2");
        Scanner sc6 = new Scanner(System.in);
        float S2marks = sc6.nextFloat();
        if(S2marks<0)
        {
            S2marks=0;
        }


        System.out.println("enter the attendance of student 2 in percentage");
        Scanner sc7 = new Scanner(System.in);
        int S2attendance = sc7.nextInt();
        if(S2attendance>75)
        {
            S2marks=(S2marks)+S2marks/10;
        }


         if(S1marks>100)
         {
             S1marks=100;
         }
         if (S2marks>100)
         {
             S1marks = 100;
         }

        System.out.printf("the marks of %s are ", S1name);
        System.out.println(S1marks);
        System.out.printf("the marks of %s are ", S2name);
        System.out.println(S2marks);





    }
}



class Student{
    String name;
    int RollNo;
    float marks;
    int attendance;
}