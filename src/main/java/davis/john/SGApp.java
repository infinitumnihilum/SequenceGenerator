package davis.john;

import java.util.Scanner;

/**
 * Created by jrdavis on 2/8/16.
 */
public class SGApp {




    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Begining Number");
        int input1 = sc.nextInt();
        System.out.println("Enter the End Number");
        int input2 = sc.nextInt();

        System.out.println("The numbers from " +input1 + " to " + input2);
        System.out.println(sequenceGenerator.printNumbers(input1,input2));

        System.out.println("");
        System.out.println("Enter start letter");
        char charinput1 = sc.next().charAt(0);
        System.out.println("Enter the ending letter");
        char charinput2 = sc.next().charAt(0);
        System.out.println("The letters from " + charinput1 + " to " + charinput2);
        System.out.println(sequenceGenerator.printAlphabet(charinput1,charinput2));

        System.out.println("Enter the Begining Number");
        int oddInput = sc.nextInt();
        System.out.println("Enter the End Number");
        int oddInput2 = sc.nextInt();
        System.out.println("Odd numbers from " + oddInput + " to " + oddInput2 +" are ");
        System.out.println(sequenceGenerator.printOddNum(oddInput,oddInput2));

    }
}
