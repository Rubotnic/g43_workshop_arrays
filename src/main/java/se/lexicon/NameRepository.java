package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    public static String[] names = new String[0];
//Returns number of elements in the array
    public static int getSize(){
        return names.length;
    }

//    Sends in an array that set the private static array.
//    This should replace all existing names.
    public  static void setNames(String[] names){
        NameRepository.names = names;
    }
//    Should completely empty the array.
    public static void clear() {
        names = new String[0];

    }
//    Returns all names in a new array
    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }



    }

