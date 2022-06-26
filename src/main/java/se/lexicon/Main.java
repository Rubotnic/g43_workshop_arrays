package se.lexicon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array Lenght: " + NameRepository.getSize());

        // Same as below!!
//        data[0] = "Mehradad Javan";
//        data[1] = "Simon Elbrink";
//        data[2] = "Asa Jonsson";

        String data[] = {"Mehrdad Javan", "Simon Elbrink", "Asa Jonsson"};
        Arrays.sort(data, String.CASE_INSENSITIVE_ORDER);
        NameRepository.setNames(data);

        System.out.println("Array Lenght: " + NameRepository.getSize());

        System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));

        System.out.println("Find By fullname: " +  NameRepository.find("Mehrdad Javan"));

//  add new name
        boolean result = NameRepository.add("Marcus Gudmonsson");
        System.out.println(result);
        System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));

//  existing name
        boolean result2 = NameRepository.add("Mehrdad Javan");
        System.out.println(result2);
        System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));

//  duplicate name
        boolean result3 = NameRepository.add("Mehrdad Javan");
        if(result3){
            System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));
        } else {
            System.out.println("Data os duplicate");
        }
    }
}