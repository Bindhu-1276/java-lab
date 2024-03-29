//Geometry: Circle and Rectangle Classes with Constructors: Create Circle and Rectangle classes
//representing geometric shapes. Implement constructors to initialize their properties like radius
//(for circle) and length and width (for rectangle). Write a program to calculate the area and
//perimeter of instances of these shapes.

import java.util.Scanner;
class area{
    double radius;
    area(int radius){
        this();
        this.radius=radius;
    }
    int len;
    int bth;
    area(int len,int bth){
        this();
        this.len=len;
        this.bth=bth;
    }
    area()
    {
        System.out.println("No args");
        
    }
   
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int radius =s.nextInt();
        area r = new area(radius);
        System.out.println(r.radius*3.14*r.radius);
        int l =s.nextInt();
        int b = s.nextInt();
        area e=new area(l,b);
        System.out.println(e.len*e.bth);
        
    }
}
