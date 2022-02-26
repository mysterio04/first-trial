import java.util.Scanner;

public class trial1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student S1 = new Student();
        Student S2 = new Student();

        System.out.println("enter the name of student 1");
        String n1 = sc.nextLine();
        S1.setName(n1);


        System.out.println("enter Roll number of student 1");
        int r1 = sc.nextInt();
        S1.setRollNo(r1);

        System.out.println("enter the marks of student 1");
        float m1 = sc.nextFloat();
        S1.setMarks(m1);



        System.out.println("enter the attendance of student 1 in percentage");
        int a1 = sc.nextInt();
        S1.setAttendance(a1);
        if(a1>75)
        {
            m1=(m1)+m1/10;
        }

        System.out.println("enter the name of student 2");
        String n2 = sc.next();
        S2.setName(n2);

        System.out.println("enter the Roll number of student 2");
        int r2 = sc.nextInt();
        S2.setRollNo(r2);

        System.out.println("enter the marks of student 2");
        float m2 = sc.nextFloat();
        S2.setMarks(m2);
        if(m2<0)
        {
            m2=0;
        }


        System.out.println("enter the attendance of student 2 in percentage");

        int S2attendance = sc.nextInt();
        if(S2attendance>75)
        {
            m2=(m2)+m2/10;
        }


        if(m1>100)
        {
            m1=100;
        }
        if (m2>100)
        {
            m2 = 100;
        }

        System.out.printf("the marks of %s are ", S1.getName());
        System.out.println(m1);
        System.out.printf("the marks of %s are ", S2.getName());
        System.out.println(m2);





    }
}



class Student{
    String name;
    int RollNo;
    float marks;
    int attendance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        if(marks<0)
        {
            marks=0;
        }
        else if(marks >100 )
        {
            marks = 100;
        }
        this.marks = marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }
}


