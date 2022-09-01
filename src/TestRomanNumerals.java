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

    private String convertToRomanNumeral(int number) {
        String result = "";

        if (number <= 3) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
            return result;
        }
        else if (number == 4) return "IV";
        else if (number == 5) return "V";
        else if (number >= 6 && number <= 8) {
            int tempCalc = number - 5;
            result = "V";
            for (int i = 0; i < tempCalc; i++) {
                result += "I";
            }
            return result;
        } else if (number == 9) return "IX";
        else if (number == 10) return "X";
        return "";
    }


}
