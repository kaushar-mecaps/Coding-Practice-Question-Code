public class WriteAMethodAndCallIt {

    public static void main(String[] args) {

        // Create Object
        MyClass myClass = new MyClass();

        // Call the Method
        myClass.printName();
    }
}

// method class
class MyClass {

    public void printName() {
        System.out.println("My Name is Kaushar Ali");
    }
}