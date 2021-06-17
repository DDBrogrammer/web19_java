package bai5_java19;

public class Employee {
    private String id;
    private String name;
    private String position;
    private String age;
    private int salary;
    public Employee(){}
    public Employee(String id, String name, String position, String age,int salary) {
      this.id=id;
      this.name=name;
      this.position=position;
      this.age=age;
      this.salary=salary;
    }
    public String getId() {
         return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
