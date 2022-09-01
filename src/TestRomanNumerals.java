import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRomanNumerals {

    @Test
    void testNumeral1() {
        assertEquals(convertToRomanNumeral(1), "I");
    }

    @Test
    void testNumeral2(){
        assertEquals(convertToRomanNumeral(2), "II");
    }

    @Test
    void testNumeral3(){
        assertEquals(convertToRomanNumeral(3), "III");
    }
    @Test
    void testNumeral4(){
        assertEquals(convertToRomanNumeral(4), "IV");
    }

    @Test
    void testNumeral5(){
        assertEquals(convertToRomanNumeral(5), "V");
    }
    @Test
    void testNumeral6(){
        assertEquals(convertToRomanNumeral(6), "VI");
    }
    @Test
    void testNumeral7(){
        assertEquals(convertToRomanNumeral(7), "VII");
    }
    @Test
    void testNumeral8(){
        assertEquals(convertToRomanNumeral(8), "VIII");
    }
    @Test
    void testNumeral9(){
        assertEquals(convertToRomanNumeral(9), "IX");
    }
    @Test
    void testNumeral10(){
        assertEquals(convertToRomanNumeral(10), "X");
    }
    @Test
    void testNumeral11(){
        assertEquals(convertToRomanNumeral(11), "XI");
    }
    @Test
    void testNumeral12(){
        assertEquals(convertToRomanNumeral(12), "XII");
    }@Test
    void testNumeral14(){
        assertEquals(convertToRomanNumeral(14), "XIV");
    }@Test
    void testNumeral15(){
        assertEquals(convertToRomanNumeral(15), "XV");
    }@Test
    void testNumeral16(){
        assertEquals(convertToRomanNumeral(16), "XVI");
    }
    @Test
    void testNumeral20(){
        assertEquals(convertToRomanNumeral(20), "XX");
    }

    private String convertToRomanNumeral(int number) {
        String result = "";
        String numberString = String.valueOf(number);


        if (number >= 10){
            int tenthPlace = Integer.parseInt(String.valueOf(numberString.charAt(numberString.length() - 2)));
            for (int i = 0; i < tenthPlace; i++) {
                result += "X";
            }
            number = number - (10 * tenthPlace);
        }

        if (number <= 3) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
            return result;
        }
        else if (number == 4) result += "IV";
        else if (number == 5) result += "V";
        else if (number >= 6 && number <= 8) {
            int tempCalc = number - 5;
            result += "V";
            for (int i = 0; i < tempCalc; i++) {
                result += "I";
            }
            return result;
        } else if (number == 9) result += "IX";
        return result;
    }


}
