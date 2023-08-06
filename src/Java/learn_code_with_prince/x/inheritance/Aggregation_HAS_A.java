package Java.learn_code_with_prince.x.inheritance;

public class Aggregation_HAS_A {
    // if a class has entity as a reference, In simple words a class having another class as a variables is called Aggregation

    public static void main(String[] args) {
        Address address = new Address("323-K","Park Street", 32323);
        Employee employee= new Employee(101,"Ramesh",address);

        System.out.println(address);
        System.out.println(employee);

    }
}
class Employee{
    int id;
    String name;
    //here employee is having another object as a reference or we can say Every employee has an address
    Address ad;
    Employee(int id, String name, Address ad){
        this.id=id;
        this.name=name;
        this.ad=ad;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ad=" + ad +
                '}';
    }
}
class Address{
    String hNo;
    String add;
    int zipcode;
    Address(String hNo, String add, int zipcode){
        this.hNo=hNo;
        this.add=add;
        this.zipcode=zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hNo='" + hNo + '\'' +
                ", add='" + add + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
