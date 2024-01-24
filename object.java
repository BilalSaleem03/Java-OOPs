import java.util.Scanner;

class Student
{
    String name;
    String age;
    public void studentInfo()
    {
        System.out.println(this.name);  //this keyword use data store in object that call that function
        System.out.println(this.age);
    }
}

public class object
{
    public static void main (String [] args)
    {
        Student s1 = new Student();
        s1.name = "Bilal";
        s1.age = "21";
        s1.studentInfo();
        Student s2 = new Student();
        s2.name = "Ali ";
        s2.age = "20";
        s2.studentInfo();
    }
}