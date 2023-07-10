import java.util.Arrays;
import java.util.Random;

public class Snake extends Zoo {
    private static int nextId = 0;
    private static int maxage = 5;
    private static String sound = "ссссс";
    private static String[] prefFood =  {"мыши"};
    private static Random rand = new Random();

    public Snake(int id, String name, int age, boolean asleep) {
        super(id, name, age, asleep);
    }
    public Snake() {
        super(nextId++, "NewSnake"+nextId, rand.nextInt(1, maxage), false);
    }

    public static String[] getPrefFood() {
        return prefFood;
    }

    public static String getSound() {
        return sound;
    }

    private static int selfSleep = 5;

    public  void makeCall(String name) {
        if (!isSleeping(selfSleep)) {

            System.out.printf("%s не реагирует", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }
    public  void giveFood(String food) {
        if (!isSleeping(selfSleep)) {
            if (Arrays.asList(prefFood).contains(food)) {
                System.out.printf("%s ест %s", this.name, food); System.out.println();
            } else {
                System.out.printf("%s Не взял %s", this.name, food); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

    public  void makePet() {
        if (!isSleeping(selfSleep)) {
            System.out.printf("%s ползает", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

}

