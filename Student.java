//  Inherits from Person
class Student extends Person {
    private String department;

    Student(int id, String name, int age, String department) {
        super(id, name, age); // Call parent constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    // Overriding (Polymorphism)
    @Override
    public void display() {
        System.out.println("ID: " + getId() + " | Name: " + getName() +
                           " | Age: " + getAge() + " | Dept: " + department);
    }
}
