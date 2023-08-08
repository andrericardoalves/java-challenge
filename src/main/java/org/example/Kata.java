package org.example;

/**
 * Hello world!
 *
 */
public class Kata{
    public static boolean feast(String beast, String dish) {

        return beast.substring(0, 1).equals(dish.substring(0,1)) &&
                beast.substring(beast.length() - 1, beast.length())
                        .equals(dish.substring(dish.length() -1, dish.length()));

    }
}
