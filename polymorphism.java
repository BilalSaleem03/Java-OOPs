
class Student{
    String name ; 
    int age;
    void print(String name)
    {
        System.out.println(name);
    }
    void print(int age)
    {
        System.out.println(age);
        System.out.println(name);
    }
    void print(String name , int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
}


public class polymorphism {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "saleem";
        s1.print("bilal");
        s1.print(43);
        s1.print("Bilal", 41);
        
    }
}
