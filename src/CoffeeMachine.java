import java.util.Scanner;

public class CoffeeMachine {

    public static boolean espresso(int water, int coffee, int cups)
    {
        boolean make = false;
        if(water>=250 && coffee>=16 && cups>=1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            make = true;
        }
        else
        if (water<250)
            System.out.println("Sorry, not enough water!");
        else
        if(coffee<16)
            System.out.println("Sorry, not enough coffee!");
        else
        if(cups<1)
            System.out.println("Sorry, not enough cups!");
        return make;
    }

    public static boolean latte(int water,int milk,int coffee, int cups)
    {
        boolean make = false;
        if(water>=350 && milk>=75 && coffee>=20 && cups>=1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            make=true;
        }
        else
        if (water<350)
            System.out.println("Sorry, not enough water!");
        else
        if(coffee<20)
            System.out.println("Sorry, not enough coffee!");
        else
        if(milk<75)
            System.out.println("Sorry, not enough milk!");
        else
        if(cups<1)
            System.out.println("Sorry, not enough cups!");
        return make;
    }
    public static boolean cappuccino(int water,int milk,int coffee,int cups)
    {
        boolean make = false;
        if(water>=200 && milk>=100 && coffee>=12 && cups>=1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            make = true;
        }
        else
        if (water<200)
            System.out.println("Sorry, not enough water!");
        else
        if(coffee<12)
            System.out.println("Sorry, not enough coffee!");
        else
        if(milk<100)
            System.out.println("Sorry, not enough milk!");
        else
        if(cups<1)
            System.out.println("Sorry, not enough cups!");
        return make;
    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int amountOfCups = 9;
        int amountOfWater = 400;
        int amountOfMilk = 540;
        int amountOfCoffee = 120;
        int amountOfMoney = 550;
        String choice;
        String typeOfCoffee;
        boolean exit = true;

        while (exit)
        {
            System.out.println("Write acction (buy, fill, take, remaining, exit):");
            choice = scanner.next();
            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    typeOfCoffee = scanner.next();

                    switch (typeOfCoffee) {
                        case "1":
                            if(espresso(amountOfWater,amountOfCoffee,amountOfCups)) {
                                amountOfWater -= 250;
                                amountOfCoffee -= 16;
                                amountOfMoney += 4;
                                amountOfCups--;
                            }break;
                        case "2":
                            if(latte(amountOfWater,amountOfMilk,amountOfCoffee,amountOfCups))
                            {
                                amountOfWater -= 350;
                                amountOfMilk -= 75;
                                amountOfCoffee -= 20;
                                amountOfMoney += 7;
                                amountOfCups--;
                            }
                            break;
                        case "3":
                            if(cappuccino(amountOfWater,amountOfMilk,amountOfCoffee,amountOfCups))
                            {
                                amountOfWater -= 200;
                                amountOfMilk -= 100;
                                amountOfCoffee -= 12;
                                amountOfMoney += 6;
                                amountOfCups--;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    amountOfWater += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    amountOfMilk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    amountOfCoffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    amountOfCups += scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $%d%n%n", amountOfMoney);
                    amountOfMoney = 0;
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d of water%n", amountOfWater);
                    System.out.printf("%d of milk%n", amountOfMilk);
                    System.out.printf("%d of coffee beans%n", amountOfCoffee);
                    System.out.printf("%d of disposable cups%n", amountOfCups);
                    System.out.printf("%d of money%n%n", amountOfMoney);
                    break;
                case "exit":
                    exit=false;
                    break;
            }
        }

    }
}
