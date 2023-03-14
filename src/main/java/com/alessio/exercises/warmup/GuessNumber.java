package com.alessio.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {
        String string1 = "string void";

        char[] array = string1.toCharArray();
        String string2 = String.valueOf(1001101);

        String punti = new String();
        for (int i = 0; i < 10; i++) {
            punti = punti + ".";
        }

        //System.out.println("anything");
        //System.out.print("anything ");
        //System.out.printf("anything=%d\n", 15);

        System.out.print("Guess the number of the dice:");
        RandomGenerator rnd = RandomGenerator.getDefault();
        Scanner input = new Scanner(System.in);
        int dice_number = input.nextInt();
        while(rnd.nextInt(1,6) != dice_number) {
            System.out.printf("\nIt isn't %d! Try again:", dice_number);
            input = new Scanner(System.in);
            dice_number = input.nextInt();
            rnd = RandomGenerator.getDefault();
        }
        System.out.printf("\nGood! It's %d!", dice_number);




    }
}
