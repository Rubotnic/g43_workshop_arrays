package se.lexicon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array Lenght: " + NameRepository.getSize());

        // Same as below!!
//        data[0] = "Mehradad Javan";
//        data[1] = "Simon Elbrink";
//        data[2] = "Asa Jonsson";

        String data[] = {"Mehradad Javan", "Simon Elbrink", "Asa Jonsson"};
        Arrays.sort(data, String.CASE_INSENSITIVE_ORDER);
        NameRepository.setNames(data);

        System.out.println("Array Lenght: " + NameRepository.getSize());

        System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));






    }
}