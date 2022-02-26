import java.util.Scanner;

public class Carnew {
    public Carnew() {
    }

    public static void main(String[] args) {
        System.out.println("enter option \n 1:Truck  2:car ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("enter the regular price");
        Scanner sc3 = new Scanner(System.in);
        int regularPrice = sc3.nextInt();
        switch(N) {
        case 1:
            System.out.println("you have chosen truck");
            System.out.println("enter the weight of the truck");
            Scanner sc1 = new Scanner(System.in);
            int W = sc1.nextInt();
            if (W > 2300) {
                W -= W / 10;
                System.out.println("the price of the truck is ");
                System.out.println(W);
            } else {
                W -= W / 5;
                System.out.println(W);
            }
            break;
        case 2:
            System.out.println("you have chosen car ");
            System.out.println("the price of the car is " + regularPrice);
        default:
            System.out.println("---error---");
            System.out.println("invalid input");
        }

    }
}