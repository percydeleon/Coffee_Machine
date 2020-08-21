class Car {

    int yearModel;
    String make;
    int speed;

    void  accelerate() {
        speed = speed + 5;
    }

    void brake() {
        if (speed >= 5) {
            speed = speed - 5;
        } else {
            speed = 0;
        }
    }
}