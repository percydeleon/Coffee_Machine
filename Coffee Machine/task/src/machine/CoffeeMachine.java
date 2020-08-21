package machine;

import java.util.Scanner;

public class CoffeeMachine {

    int water;
    int milk;
    int coffeeBean;
    int cups;
    int money;

    public CoffeeMachine(int water, int milk, int coffeeBean, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBean = coffeeBean;
        this.cups = cups;
        this.money = money;
    }

    static void display(CoffeeMachine coffeeMachine) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.water + " of water");
        System.out.println(coffeeMachine.milk + " of milk");
        System.out.println(coffeeMachine.coffeeBean + " of coffee beans");
        System.out.println(coffeeMachine.cups + " of disposable cups");

        if (coffeeMachine.money > 0) {
            System.out.println("$" + coffeeMachine.money + " of money");
        } else {
            System.out.println(coffeeMachine.money + " of money");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine(400, 540, 120, 9, 550);
        getAction(cm);
    }

    static void getAction(CoffeeMachine cm) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        switch (action.toLowerCase()) {
            case "buy":
                buy(cm);
                break;
            case "fill":
                fill(cm);
                break;
            case "take":
                take(cm);
                break;

            case "remaining":
                remaining(cm);
                break;

            case "exit":
//                System.out.println("bug");
                System.exit(0);
                break;

            default:
                getAction(cm);
                break;
        }
    }

    static void buy(CoffeeMachine cm) {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        Scanner scanner = new Scanner(System.in);
        String product = scanner.next();
        switch (product) {
            case "1":
                if (cm.water < 250) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                    break;
                }

                if (cm.coffeeBean < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                    break;
                }

                cm.water -= 250;
                cm.coffeeBean -= 16;
                cm.money += 4;
                cm.cups -= 1;

                System.out.println("I have enough resources, making you a coffee");
                System.out.println();
                break;

            case "2":
                if (cm.water < 350) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                    break;
                }

                if (cm.coffeeBean < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                    break;
                }

                if (cm.milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                    break;
                }

                System.out.println("I have enough resources, making you a coffee");
                System.out.println();
                cm.water -= 350;
                cm.coffeeBean -= 20;
                cm.milk -= 75;
                cm.money += 7;
                cm.cups -= 1;
                break;

            case "3":
                if (cm.water < 200) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                    break;
                }

                if (cm.coffeeBean < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                    break;
                }

                if (cm.milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                    break;
                }

                cm.water -= 200;
                cm.coffeeBean -= 12;
                cm.milk -= 100;
                cm.money += 6;
                cm.cups -= 1;

                System.out.println("I have enough resources, making you a coffee");
                System.out.println();
                break;

            case "back":
                getAction(cm);
                break;

            default:
                buy(cm);
                break;
        }

        getAction(cm);

    }

    static void fill(CoffeeMachine cm) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = s.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = s.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffee = s.nextInt();
        System.out.println("Write how many disposable cups do you want to add:");
        int cups = s.nextInt();

        cm.water += water;
        cm.milk += milk;
        cm.coffeeBean += coffee;
        cm.cups += cups;

        getAction(cm);


    }

    static void take(CoffeeMachine cm) {
        System.out.println("I gave you $" + cm.money);
        cm.money = 0;
        getAction(cm);
    }

    static void remaining(CoffeeMachine cm) {
        display(cm);
        getAction(cm);
        
    }











































//    int kaha = 550;
//    int waterContent = 400;
//    int milkContent = 540;
//    int coffeeBeanContent = 120;
//    int disposableCup = 9;
//
//    public static void old_main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how man ml of water the coffee machine has:");
//        int water = scanner.nextInt();
//
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milk = scanner.nextInt();
//
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int beans = scanner.nextInt();
//
//        System.out.println("Write how many cups of coffee you will need:");
//        int ask = scanner.nextInt();
//
//        CoffeeMachine c = new CoffeeMachine();
//        c.makeCoffee(water, milk, beans, ask);
//    }
//
//    public void makeCoffee(int water, int milk, int beans, int ask) {
//        int extraWater = (water) / 200;
//        int extraMilk = (milk) / 50;
//        int extraBeans = (beans) / 15;
//
//        int min = 0;
//
//        if (extraWater <= extraMilk && extraWater <= extraBeans) {
//            min = extraWater;
//        } else if (extraMilk <= extraWater && extraMilk <= extraBeans) {
//            min = extraMilk;
//        } else  {
//            min = extraBeans;
//        }
//
//        if (ask == min) {
//            System.out.println("Yes, I can make that amount of coffee");
//        }
//
//        if (ask > min) {
//            System.out.println("No, I can make only " + min + " cups of coffee");
//        }
//
//        if (ask < min) {
//            int diff = min - ask;
//            System.out.println("Yes, I can make that amount of coffee (and even " + diff + " more than that)");
//        }
//    }
//
//    private void testMakeCoffee() {
//        CoffeeMachine c = new CoffeeMachine();
//        c.makeCoffee(300, 65, 100, 1);
//        c.makeCoffee(500, 250, 200, 10);
//        c.makeCoffee(1550, 299, 300, 3);
//        c.makeCoffee(0, 0, 0, 1);
//        c.makeCoffee(0, 0, 0, 0);
//        c.makeCoffee(250, 50, 15, 0);
//        c.makeCoffee(600, 153, 100, 1);
//    }
//
//    public static void main(String[] args) {
//
//        CoffeeMachine c = new CoffeeMachine();
//
//        display(c.waterContent, c.milkContent, c.coffeeBeanContent, c.disposableCup, c.kaha);
//        getAction();
//    }
//
//    static void display(int water, int milk, int coffee, int cups, int money) {
//        System.out.println("The coffee machine has:");
//        System.out.println(water + " of water");
//        System.out.println(milk + " of milk");
//        System.out.println(coffee + " of coffee beans");
//        System.out.println(cups + " of disposable cups");
//        System.out.println(money + " of money");
//        System.out.println();
//    }
//
//    static void getAction() {
//        System.out.println("Write action (buy, fill take):");
//        Scanner scanner = new Scanner(System.in);
//        String action = scanner.next();
//
//        switch (action.toLowerCase()) {
//            case "buy":
//                buy();
//                break;
//            case "fill":
//                fill();
//                break;
//            case "take":
//                take();
//                break;
//
//            default:
//                getAction();
//                break;
//        }
//    }
//
//    static void buy() {
//        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
//        Scanner scanner = new Scanner(System.in);
//        int product = scanner.nextInt();
//        int saleCoffee = 0;
//        int saleWater = 0;
//        int salePrice = 0;
//        int saleMilk = 0;
//
//        CoffeeMachine c = new CoffeeMachine();
//
//        switch (product) {
//            case 1:
//                saleWater = c.waterContent - 250;
//                saleCoffee = c.coffeeBeanContent - 16;
//                salePrice = c.kaha + 4;
//
//                display(saleWater, c.milkContent, saleCoffee, c.disposableCup - 1, salePrice);
//                break;
//
//            case 2:
//                saleWater = c.waterContent - 350;
//                saleCoffee = c.coffeeBeanContent - 20;
//                saleMilk = c.milkContent - 75;
//                salePrice = c.kaha + 7;
//
//                display(saleWater, saleMilk, saleCoffee, c.disposableCup - 1, salePrice);
//                break;
//
//            case "3":
//                saleWater = c.waterContent - 200;
//                saleCoffee = c.coffeeBeanContent - 12;
//                saleMilk = c.milkContent - 100;
//                salePrice = c.kaha + 6;
//
//                display(saleWater, saleMilk, saleCoffee, c.disposableCup - 1, salePrice);
//                break;
//
//            case "back":
//                getAction();
//                break;
//
//            default:
//                buy();
//                break;
//        }
//
//    }
//
//    static void fill() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many ml of water do you want to add:");
//        int additionalWater = scanner.nextInt();
//        System.out.println("Write how many ml of milk do you want to add:");
//        int additionalMilk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee do you want to add:");
//        int additionalCoffee = scanner.nextInt();
//        System.out.println("Write how many disposable cups of coffee do you want to add:");
//        int additionalCups = scanner.nextInt();
//
//        CoffeeMachine c = new CoffeeMachine();
//        display(c.waterContent + additionalWater, c.milkContent + additionalMilk, c.coffeeBeanContent + additionalCoffee, c.disposableCup + additionalCups, c.kaha);
//    }
//
//    static void take() {
//        CoffeeMachine c = new CoffeeMachine();
//        System.out.println("I gave you $" + c.kaha );
//        display(c.waterContent, c.milkContent, c.coffeeBeanContent, c.disposableCup, 0);
//    }
}
