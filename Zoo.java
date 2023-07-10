import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Data
@AllArgsConstructor
public abstract class Zoo {
    int id;
    protected String name;
    protected int age;
    protected boolean asleep;
    protected static Random rand = new Random();
    private static String[] prefFood;
    private static int selfSleep;  

    protected boolean isSleeping(int sleepChance) {

        int r = rand.nextInt(1,sleepChance);
        boolean result = r == 1 ? true : false;
        return result;
    }

    protected abstract void makeCall(String name);


    protected abstract void makePet();

    public  void giveFood(String food) {
        if (!isSleeping(this.selfSleep)) {
            if (Arrays.asList(this.prefFood).contains(food)) {
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




}




}