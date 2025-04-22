package basics.oop.thisandsuper;

class Animal {
    String name = "Animal";
}

class Dog extends  Animal {
    String name = "Dog";

    void printName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class thisandsuper {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printName();
    }

}
