package chapter1;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {


        String[] availablePets = {"cats", "dogs", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

        int indexOfAvailablePet = 2;
        int indexOfUnavailablePet = 0;

        String availablePet = availablePets[indexOfAvailablePet];
        String unavailablePet = unavailablePets[indexOfUnavailablePet];

        availablePets[indexOfAvailablePet] = unavailablePet;
        unavailablePets[indexOfUnavailablePet] = availablePet;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));



    }

    public static boolean isItemInArray(String item, String[] itemArray) {
        for (String i : itemArray) {
            if (i.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }



}









