package com.company;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

        double speed;
        int regularPrice;
        String color;
        System.out.println("enter option \n 1:Truck  2:car ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==1)
        {
            System.out.println("enter the weight of the truck ");
            Scanner sc1 = new Scanner(System.in);
            int X = sc1.nextInt();
            if(X>2300)
            {
                
            }


        }
        else {
            System.out.println("enter the regular price of the car");
            Scanner sc2 = new Scanner(System.in);
            int Y = sc2.nextInt();
            System.out.println("the Sale Price of the car is ");
            System.out.println(Y);
        }

    }
}

class GetSaleprice {
  private int Saleprice;
  public int getSaleprice()
  {
      return Saleprice;
  }
  public void setSaleprice(int N)
  {
      this.Saleprice = N;
  }

}

class Truck{
    float weight;

}

