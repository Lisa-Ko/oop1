import java.util.Arrays;
import java.util.Random;



public class Dog extends Zoo {
    private static int nextId = 0;
    private static int maxage = 15;
    private static String sound = "гав-гав";
    private static String[] prefFood =  {"сосиска", "косточка", "собачий корм"};
    private static int selfSleep = 7;   


    public Dog(int id, String name, int age, boolean asleep) {
        super(id, name, age, asleep);
    }
    public Dog() {
        super(nextId++, "NewDog"+nextId, rand.nextInt(1, maxage), false);
    }

    public static String[] getPrefFood() {
        return prefFood;
    }

    public static String getSound() {
        return sound;
    }




    public  void makeCall(String name) {
        if (!isSleeping(selfSleep)) {
            if (name == this.name) {
                System.out.printf("%s бежит и виляет хвостом, %s", this.name, Dog.getSound()); System.out.println();
            }
            else {
                System.out.printf("%s не реагирует", this.name); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }
    public  void giveFood(String food) {
        if (!isSleeping(selfSleep)) {
            if (Arrays.asList(prefFood).contains(food)) {
                System.out.printf("%s ест %s", this.name, food); System.out.println();
            }
            else {
                System.out.printf("%s Понюхал и не взял %s", this.name, food); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

    public  void makePet() {
        if (!isSleeping(selfSleep)) {
            System.out.printf("%s радостно урчит и виляет хвостом", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

}