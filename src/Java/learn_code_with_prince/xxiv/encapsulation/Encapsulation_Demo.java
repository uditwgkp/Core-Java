package Java.learn_code_with_prince.xxiv.encapsulation;

public class Encapsulation_Demo {
    // it is a process wrapping code and data together into a single unit.
    // we can create a fully encapsulated class by making all the data member in the class private and providing getter and setter to set and get the value
    // java bean is a fully encapsulated class.
    // it help in making a class read/write only, also in controling over the date, and it is a way to achieve data hiding.

}
class Demo{
    private int id;
    private String name;


    //getter and setter
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
}
