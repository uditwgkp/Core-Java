package Java.learn_code_with_prince.xxiii.access_modifiers;

public class AccessModifiers_Demo {
    // The use of access modifiers in java specifies the accessibility or scope of field, method, constructor or class.
    // There are mainly four access modifiers: private, default, protected and public
    // private--> within class
    // default--> within class and package
    // protected--> within class and package also outside package by subclass only.
    // public--> anywhere

    public static void main(String[] args) {

    }
    class Demo{

        private int id; // cannot be accessed outside class
        protected int rollNo; //can be accessed within class and packages and outside package by subclass only
        public String name; // can be access from anywhere

        private void printId(int id){
            System.out.println(id);
        }
        protected void printrollNo(int rollNo){
            System.out.println(rollNo);
        }
        public void printName(String name){
            System.out.println(name);
        }

        private Demo(){}
        protected Demo(int id){this.id = id;}
        public Demo(int id, int rollNo){this.id=id; this.rollNo=rollNo;}
    }
}
