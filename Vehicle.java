import java.util.Scanner;

class Car 
{
    double speed;
    double regularPrice;
    String color;

    Car(double sp,String str,double rp)
    {
        speed=sp;
        color=str;
        regularPrice=rp;
        
    }

    public double getSalePrice()
    {
        return regularPrice;
    }
    
}
class Truck extends Car
{
    double weight;

    Truck(double sp,String str,double rp,double w)
    {
        super(sp,str,rp);
        weight=w;

    }
    
    public double getSaleprice()
    {
        if(weight>2300)
        {double r =super.getSalePrice()*0.9;
            return r;}

        else 
        
        {double r=super.getSalePrice()*0.8;
            return r;}
    }
}


public class Vehicle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        


        System.out.println("enter the speed of the truck ");
        
        double spd = sc.nextInt();
         

        System.out.println("enter the regular price of the truck ");
        
        double a = sc.nextInt();

        System.out.println("enter the weight of the truck ");
        
        double b = sc.nextDouble();


        System.out.println("enter the color of the truck ");
        
        String c = sc.next();


        Truck obj = new Truck(spd, c, a, b);
            
            
            System.out.println("regular price is" +   obj.getSalePrice());
            
             sc.close();
        
        

    }
}
