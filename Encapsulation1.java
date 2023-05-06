class Student{
    private int age ;
    private String name ;
    Student(int age , String name)
    {
        this.age = age ;
        this.name = name ;
    }

    public int getAge() {
        return age;
    }

   public void setAge(int age) {
     this.age = age;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void show(){
        System.out.println(name + " " + age);
    }

}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student(5,"Rahul");
        Student obj1 = new Student(8 ,"Pradeep");

        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
        String stud1Name = obj.getName();
        System.out.println(stud1Name);
        int stud2Age = obj1.getAge();
        System.out.println(stud2Age);
        String stud2Name = obj1.getName();
        System.out.println(stud2Name);
        }
}
