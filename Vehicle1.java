

import java.util.Scanner;

class Car{
    double speed;
    String color;
    double regularPrice;
    double salePrice = regularPrice;

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}

class Truck extends Car{
    double weight;
    double salePriceTruck;

    public double getSalePriceTruck() {
        return salePriceTruck;
    }

    public void setSalePriceTruck(double salePriceTruck) {
        if(salePriceTruck>2300)
        {
            salePriceTruck -= salePriceTruck/10;
        }
        else
        {
            salePriceTruck -= (salePriceTruck*2)/10;
        }
        this.salePriceTruck = salePriceTruck;

    }
}




public class Vehicle1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the choice 1:Truck  2:Car ");
        int i = sc.nextInt();

        if(i==1) {
            Truck king = new Truck();

            System.out.println("enter the colour of the truck ");
            String str = sc.next();

            System.out.println("enter the speed of the truck");
            int sp = sc.nextInt();

            System.out.println("enter the Regular price of the Truck ");
            double pr = sc.nextDouble();
            king.setSalePriceTruck(pr);

            System.out.println("colour of the truck is " + str);
            System.out.println("speed of the truck is " + sp);
            System.out.println("the discounted price of the truck is " + king.getSalePriceTruck());

        }
        else
        {
            Car king1 = new Car();

            System.out.println("enter the colour of the car ");
            String str1 = sc.next();

            System.out.println("enter the speed of the car ");
            int  sp1 = sc.nextInt();

            System.out.println("enter the Regular price of car ");
            double pr1 = sc.nextDouble();
            king1.setSalePrice(pr1);

            System.out.println("colour of the car is " + str1);
            System.out.println("speed of the car is " + sp1);
            System.out.println("the discounted price of the car is " + king1.getSalePrice());




        }



    }
}
