class Student
{
    private String name;
    private int age;
    private double marks;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setMarks(double marks)
    {
        this.marks = marks;
    }

    public double getMarks()
    {
        return marks;
    }

    public static void main(String args[])
    {
        Student s = new Student();

        s.setName("Parshwa");
        s.setAge(20);
        s.setMarks(91.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}