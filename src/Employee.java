public class Employee {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String positiion;
    private double salary;
    public Employee(){
        id_gen = id++;
    }
    public Employee (String name, String surname){
        this();
        this.name = name;
    }
    public Employee (String name, String surname, int age, boolean gender, String positiion, double salary){
        this(name, surname);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.positiion = positiion;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }
    public String getPosition() {
        return positiion;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setPosition(String positiion) {
        this.positiion = positiion;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee id:" + id_gen + "\nFull name:" + name + " " + surname + " \nAge:" + age + "\nGender:" + (gender ? "male" : "female") + "\nPosition:" + positiion + "\nSalary:" + salary;
    }
}
