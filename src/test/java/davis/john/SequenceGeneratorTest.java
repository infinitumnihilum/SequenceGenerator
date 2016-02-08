package davis.john;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/8/16.
 */
public class SequenceGeneratorTest {
    SequenceGenerator sequenceGenerator;

    @Before
    public void setUP(){
        sequenceGenerator = new SequenceGenerator();


    }

    @Test
    public void testPrintNumbers() {

        String expected = " 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26";
        String actual = sequenceGenerator.printNumbers(1,26);
        assertEquals("String is equal", expected, actual);
        System.out.println("Test Passed");
        //assertEquals("Does not equal the numbers");

    }

    @Test
    public void testPrintAlphabet() {

        String expected = " A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String actual1 = sequenceGenerator.printAlphabet('A', 'Z');
        String actual2 = sequenceGenerator.printAlphabet('a', 'z');
        assertEquals("Character betweeen A - Z",expected, actual1 );
        System.out.println("Test Passed");
        assertEquals("Characters between a-z", expected, actual2);
        System.out.println("Test Passed");
    }

    @Test
    public void testPrintOddNum() {

        String expected = " 1 3 5 7 9 11 13 15 17 19 21 23 25";
        String actual = sequenceGenerator.printOddNum(1,25);
        assertEquals("Expected result is int ", expected, actual );
        System.out.println("Test Passed");
    }
}

