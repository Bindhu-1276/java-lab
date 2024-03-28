////tudent Class with Constructor: Create a Student class with fields like name, rollNumber, and
//grade. Implement a constructor to initialize these fields. Write a program to create instances of
//Student using this constructor and display their details.


class Test{
String name;
int rollno;
char grade;
Test(String name,int rollno,char grade){
this.name=name;
this.rollno=rollno;
this.grade=grade;
}
}
class student{
public static void main(String args[]){
Test s1 = new Test("Bindhu",1276,'A');
System.out.println(s1.name+" "+s1.rollno+" "+s1.grade+" ");
}
}

Output:Bindhu 1276 A
