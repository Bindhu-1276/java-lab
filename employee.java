//Employee Class with Constructor Overloading: Define an Employee class with fields like name, id,
//and salary. Implement multiple constructors including a default constructor, a parameterized
//constructor, and a constructor that initializes only the name and sets default values for other
//attributes. Write a program to create instances of Employee using these constructors and display
//their details.


class employee{
String name;
int id;
int salary;
employee(String name){
this();
this.name=name;
}
employee()
{
System.out.println("No args");
System.out.println(id+" " +salary+" ");
}
public static void main(String args[]){
employee t= new employee("Bindhu");
System.out.println(t.name);
}
}
