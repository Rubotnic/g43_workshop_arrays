package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    public static String[] names = new String[0];

    // 1.1 Returns number of elements in the array
    public static int getSize() {
        return names.length;
    }

    //    1.2 Sends in an array that set the private static array.
    //    This should replace all existing names.
    public static void setNames(String[] names) {
        NameRepository.names = names;
    }

    //    1.3 Should completely empty the array.
    public static void clear() {
        names = new String[0];
    }

    //    1.4 Returns all names in a new array
    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    //    2.1 Returns name if found and null if not found.
    public static String find(final String fullName) {

        // step 1: cross on array.
        for (String element: names) {

            // step 2: write a condition to compare element of array with the method param(fullName).
            if (element.equalsIgnoreCase(fullName)) {

                return element;
            }
        }
        return null;
    }

    // 2.2 Should add a new name to the array.
    // Returns true when name was added and false when the array contains the name.
    public static boolean add(final String fullName) {
        // step 1: find by full name.
        // step 2: check if data exit return false, else
        // step 3: make a copy of array with a new element
        // step 4: add the method parameter to the last index of the copied array
        // step 5: replace the copied array with current names array
        // step 6: return true

        String result = find(fullName);

        if (result != null) {
            return false;
        }
        String[] newArray = Arrays.copyOf(names, names.length + 1);
        newArray[newArray.length - 1] = fullName;
        names = newArray;

        return true;

    }
}

