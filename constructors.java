class Student
{
    String name;
    String age;
    public void studentInfo()
    {
        System.out.println(this.name);  //this keyword use data store in object that call that function
        System.out.println(this.age);
    }
    Student()
    {
        System.out.println("constructor");
    } 

    Student(String n , String a)
    {
        //System.out.println(n+" "+a);
        this.name = n;
        this.age = a;
    }
    Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;
    }
}

public class constructors
{
    public static void main (String [] args)
    {
        System.out.println("parametarized constructor.....");
        Student s1 = new Student("Bilal","21");
        //s1.name = "Bilal";
        //s1.age = "21";
        s1.studentInfo();
        System.out.println("pass object as parameter.......");
        Student s2 = new Student(s1);
        //s2.name = "Ali ";
        //s2.age = "20";
        s2.studentInfo();
        System.out.println("Non Parametrarized constructor......");
        Student s3 = new Student();
        s3.name = "Bilal";
        s3.age = "21";
        s3.studentInfo();
    }
}