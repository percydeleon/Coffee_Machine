enum DangerLevel {
    HIGH(3, "HIGH"),
    MEDIUM(2, "MEDIUM"),
    LOW(1, "LOW");

    int level;
    String levelInWord;


    public int getLevel() {
        return level;
    }

    public String getLevelInWord() {
        return levelInWord;
    }


    DangerLevel(int level, String levelInWord) {
        this.level = level;
        this.levelInWord = levelInWord;
    }


}

//class Test {
//    public static void main(String[] args) {
//        DangerLevel high = DangerLevel.HIGH;
//        DangerLevel medium = DangerLevel.MEDIUM;
//
//        System.out.println(high.getLevel() > medium.getLevel()); // true
//    }
//}