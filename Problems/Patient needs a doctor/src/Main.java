class Patient {

    String name;

    // write your method here
    public Patient(String name) {
        this.name =  name;
    }

    public Patient() {

    }

    public void say() {
        System.out.println("Hello, my name is " + this.name + ", I need a doctor.");
    }

//    public static void main(String[] args) {
//        Patient p = new Patient();
//        p.name = "percy";
//        p.say();;
//
////        Patient percy = new Patient("Percy");
////        percy.say();
////
////        Patient enzo = new Patient("Enzo");
////        enzo.say();
//    }
}