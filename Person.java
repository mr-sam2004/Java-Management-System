// Base Class (for Inheritance)
class Person {
    private int id;
    private String name;
    private int age;

    // Constructor
    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters & Setters (Encapsulation)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Method (will be overridden → Polymorphism)
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}
