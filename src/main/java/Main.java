import java.util.Scanner;

import Zoo.*;
public class Main {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("List of animals, fish and birds");
            System.out.println("1.Lion");
            System.out.println("2.Elephant");
            System.out.println("3.Gazelle");
            System.out.println("4.Bullfinch");
            System.out.println("5.Eagle");
            System.out.println("6.Pigeon");
            System.out.println("7.Shark");
            System.out.println("8.Pike");
            System.out.println("9.Bream");
            System.out.println("Please, enter your choose:");
            Lion lion = new Lion();
            Elephant elephant = new Elephant();
            Gazelle gazelle = new Gazelle();
            Bullfinch bullfinch = new Bullfinch();
            Pigeon pigeon = new Pigeon();
            Eagle eagle = new Eagle();
            Pike pike = new Pike();
            Shark shark = new Shark();
            Bream bream = new Bream();
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            switch (number){
                case 0:
                    System.out.println("Wrong number, error. ");
                    break;
                case 1:
                    lion.nameOfAnimal();
                    lion.move();
                    lion.breathe();
                    lion.uniqueFeatures();
                    break;
                case 2:
                    elephant.nameOfAnimal();
                    elephant.move();
                    elephant.breathe();
                    elephant.uniqueFeatures();
                    break;
                case 3:
                    gazelle.nameOfAnimal();
                    gazelle.move();
                    gazelle.breathe();
                    gazelle.uniqueFeatures();
                    break;
                case 4:
                    bullfinch.nameOfBird();
                    bullfinch.move();
                    bullfinch.breath();
                    bullfinch.uniqueFeatures();
                    break;
                case 5:
                    eagle.nameOfBird();
                    eagle.move();
                    eagle.breath();
                    eagle.uniqueFeatures();
                    break;
                case 6:
                    pigeon.nameOfBird();
                    pigeon.move();
                    pigeon.breath();
                    pigeon.uniqueFeatures();
                    break;
                case 7:
                    shark.nameOfFish();
                    shark.move();
                    shark.breathe();
                    shark.uniqueFeatures();
                    break;
                case 8:
                    pike.nameOfFish();
                    pike.move();
                    pike.breathe();
                    pike.uniqueFeatures();
                    break;
                case 9:
                    bream.nameOfFish();
                    bream.move();
                    bream.breathe();
                    bream.uniqueFeatures();
                    break;
                default:
                    System.out.println("Thank for your choose! ");
            }}
        while (number != 0);
        System.out.println("");
    }
}
