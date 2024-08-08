import java.util.Scanner;

class mob
{
    String brand;
    int price;
    static String name;
    Scanner sc =new Scanner (System.in);
    
    void show()
    {
        System.out.println("\nBrand :" + brand);
        System.out.println("Price :" + price);
        System.out.println("Name :" + name + "\n");
    }
     void get()
     {
        System.out.println("\nEnter info of device :");
        brand =sc.next();
        price=sc.nextInt();
        name=sc.next();
     }
}

class mobile
{
    public static void main(String args[])
    {
        
        
    
        mob m1=new mob();
        mob m2=new mob();
        mob m3=new mob();

    

        m1.get();
        m2.get();
        m3.get();
        
        m1.show();
        m2.show();
        m3.show();
       
    }
}