package davis.john;

import java.util.Scanner;

/**
 * Created by jrdavis on 2/8/16.
 */
public class SequenceGenerator {


    public static void main(String[] args) {

    }
    private String printSequence(int beginNum, int endNum, boolean printNumber, boolean printOnlyOdd) {
        String stringOfNumbers = "";
        char theChars = 0;
        boolean shouldPrint = true;

        for (int i = beginNum; i <= endNum; i++) {
            if (printOnlyOdd && i % 2 != 0) {
                shouldPrint = true;
            } else if (!printOnlyOdd) {
                shouldPrint = true;
            } else {
                shouldPrint = false;
            }
            if (printNumber) {
                if (shouldPrint) {
                    stringOfNumbers = stringOfNumbers + " " + i;
                }
            } else {
                if (shouldPrint) {
                    theChars = (char) i;
                    stringOfNumbers = stringOfNumbers + " " + theChars;
                }


            }
        }
        return stringOfNumbers.toUpperCase();

    }


    public String printNumbers(int beginNum, int endNum) {
        return printSequence(beginNum,endNum,true, false);

    }

    public String printAlphabet(char beginNum, char endNum) {
        return printSequence(beginNum, endNum, false, false);

    }
    public String printOddNum(int beginNum, int endNum) {
        return printSequence(beginNum,endNum,true,true);




    }
    private void itterator(){

    }
}