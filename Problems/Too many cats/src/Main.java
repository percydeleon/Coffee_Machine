class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        // do not forget to check the number of cats
        this.counter++;

        if (Cat.getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }

//    public static void main(String[] args) {
//        Cat garfield = new Cat("Garfield", 1);
//        Cat felix = new Cat("Felix", 2);
//        Cat heathcliff = new Cat("Heathcliff", 3);
//        Cat marmaduke = new Cat("Marmaduke", 4);
//        Cat duke = new Cat("Duke", 5);
//        Cat flint = new Cat("Flint", 6);
//        Cat pusa = new Cat("Pusa", 7);
//    }
}