class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (this.minutes == 59) {
            this.minutes = 0;
            this.hours = this.hours + 1;
            if (this.hours > 12) {
                this.hours = this.hours - 12;
            }
        } else  {
            this.minutes++;
        }
    }

//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.hours = 12;
//        clock.minutes = 59;
//        clock.next();
//        System.out.println(clock.hours  + ":" + clock.minutes);
//    }
}