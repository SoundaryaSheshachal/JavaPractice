public class Student
{
    public int id;
    public String name;
    public String address;
    public int totalMark;

    public String CalculateGrade()
    {
        if (totalMark >= 90)
            return "S";

        if (totalMark >= 80)
            return "A";

        if (totalMark >= 60)
            return "B";

        return "F";
    }

    public Student()
    {}

    public Student(int i, String n, String a, int t)
    {
        id = i;
        name = n;
        address = a;
        totalMark = t;
    }

    public static void Display()
    {
        //Student s1 = new Student();
        System.out.println("Hello Inside Student class");
        //System.out.println(s1.id);
    }

    public static void main(String[] args)
    {
        System.out.println("Static Method");
        Student student = new Student(5, "Akshay", "ABC", 90);
        Student student2 = new Student();

        System.out.println("id " + student.id);
        System.out.println("name  " + student.name);
        System.out.println("address  " + student.address);
        System.out.println("totalMark  " + student.totalMark);
        System.out.println("CalculateGrade  " + student.CalculateGrade());

        System.out.println("id " + student2.id);
        System.out.println("name  " + student2.name);
        System.out.println("address  " + student2.address);
        System.out.println("totalMark  " + student2.totalMark);
        System.out.println("CalculateGrade  " + student2.CalculateGrade());


        Display();
        Student.Display();
    }

}


/*
public class Student {
  public int id;
  public java.lang.String name;
  public java.lang.String address;
  public int totalMark;
  public Student();
  public java.lang.String CalculateGrade();
  public static void main(java.lang.String[]);
}
*/