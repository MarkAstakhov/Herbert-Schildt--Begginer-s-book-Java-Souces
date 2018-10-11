package chapter_01.exercises;

public class GalToLitTable {

    public static void main(String[] args) {

        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 30; gallons++) {
            liters = gallons * 3.7854; // Gallons into liters
            System.out.println(gallons + " gallon corresponds " + liters + " liters.");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0; // Count reset
            }
        }

    }
}
