import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

        double speed;
        int regularPrice;
        String color;
        Scanner sc = new Scanner(System.in);
        speed = sc.nextInt();
        System.out.println("enter option \n 1:Truck  2:car ");
        Scanner sc1 = new Scanner(System.in);
        int N = sc1.nextInt();
        
        Scanner sc3 = new Scanner(System.in);
         regularPrice = sc3.nextInt();
        if(N==1)
        {
            System.out.println("enter the weight of the truck ");
            Scanner sc2 = new Scanner(System.in);
            int X = sc2.nextInt();
            t = GetSaleprice();
            if(X>2300)
            {
               System.out.println((X*9)/10); 
            }
            else if(X<2300 && X>0)
            {
                System.out.println((X*8)/10);
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

