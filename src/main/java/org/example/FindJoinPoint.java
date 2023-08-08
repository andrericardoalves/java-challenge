package org.example;

import java.util.Arrays;

public class FindJoinPoint {

    public int findJoinPointMyVersion (int number1, int number2){
        final int MAX_NUMBER = 10_000_000;
        int count = 0;
        while(count < MAX_NUMBER){

          String [] digits1 = String.valueOf(number1).split("(?<=.)");
          String [] digits2 = String.valueOf(number2).split("(?<=.)");
          number1 = number1 + Arrays.stream(digits1).mapToInt(Integer::parseInt).reduce(0 , Integer::sum);
          number2 = number2 + Arrays.stream(digits2).mapToInt(Integer::parseInt).reduce(0 , Integer::sum);
         // System.out.println(number1 + " -  " + number2);
          if(number1 == number2)
            return number1;
          count ++;
        }
        return -1;
    }

    public int findJoinPointMyVersion2 (int number1, int number2) {
        int[] intTab1 = String.valueOf(number1).chars().map(Character::getNumericValue).toArray();
        int[] intTab2 = String.valueOf(number2).chars().map(Character::getNumericValue).toArray();


        return 1;
    }

    public int findJoinPoint(int seq1, int seq2){

        while (seq1 != seq2){

            if (seq1 < seq2){
                if (seq1 == 0)
                    return -1; // no chance to join, seq1 is 0

                seq1 += getDigitsSum(seq1);

            }else if (seq2 < seq1){
                if (seq2 == 0)
                    return -2; // no chance to join, seq2 is 0

                seq2 += getDigitsSum(seq2);
            }
        }

        return seq1;
    }


   public int getDigitsSum(int number) {
        int sum = 0;
        int numberAux = number;
        while (numberAux != 0){
            int currentDigit = numberAux % 10;
            sum += currentDigit;
            numberAux /= 10;
        }

        return sum;
    }
}
