interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Parrot implements Animal, Bird {
    public void eat() {
        System.out.println("Parrot is eating");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }
}

class Demo {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.fly();
    }
}
