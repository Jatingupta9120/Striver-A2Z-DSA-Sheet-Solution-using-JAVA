interface Dog {
    void bark();
    }
    interface Cat {
    void meow();
    }
    class Animal implements Dog, Cat {
    public void bark() {
    System.out.println("Dog is barking");
    }
    public void meow() {
    System.out.println("Cat is meowing");
    }
    }
    class Main {
    public static void main(String args[]) {
    Animal a = new Animal();
    a.bark();
    a.meow();
    }
    }