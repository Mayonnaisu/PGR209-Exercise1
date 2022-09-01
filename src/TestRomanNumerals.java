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
    @Test
    void testNumeral40(){
        assertEquals(convertToRomanNumeral(40), "XL");
    }
    @Test
    void testNumeral44(){
        assertEquals(convertToRomanNumeral(44), "XLIV");
    }
    @Test
    void testNumeral46(){
        assertEquals(convertToRomanNumeral(46), "XLVI");
    }
    @Test
    void testNumeral48(){
        assertEquals(convertToRomanNumeral(48), "XLVIII");
    }
    @Test
    void testNumeral50(){
        assertEquals(convertToRomanNumeral(50), "L");
    }
    @Test
    void testNumeral84(){
        assertEquals(convertToRomanNumeral(84), "LXXXIV");
    }
    @Test
    void testNumeral86(){
        assertEquals(convertToRomanNumeral(86), "LXXXVI");
    }
    @Test
    void testNumeral99(){
        assertEquals(convertToRomanNumeral(99), "XCIX");
    }

    @Test
    void testNumeral00(){
        assertEquals(convertToRomanNumeral(100), "C");
    }
    @Test
    void testNumeral140(){
        assertEquals(convertToRomanNumeral(140), "CXL");
    }
    @Test
    void testNumeral450(){
        assertEquals(convertToRomanNumeral(450), "CDL");
    }
    @Test
    void testPrint(){
        for (int i = 0; i < 999; i++) {
            System.out.println("" + i + " : " + convertToRomanNumeral(i));
        }
    }

    private String convertToRomanNumeral(int number) {
        String result = "";
        String numberString = String.valueOf(number);

        if (number >= 100) {
            int thousandthPlace = Integer.parseInt(String.valueOf(numberString.charAt(numberString.length() - 4)));
            switch (thousandthPlace) {
                case 1 -> result += "M";
                case 2 -> result += "MM";
                case 3 -> result += "MMM";
            }
            number = number - (1000 * thousandthPlace);
        }

        if (number >= 100) {
            int hundredthPlace = Integer.parseInt(String.valueOf(numberString.charAt(numberString.length() - 3)));
            switch (hundredthPlace) {
                case 1 -> result += "C";
                case 2 -> result += "CC";
                case 3 -> result += "CCC";
                case 4 -> result += "CD";
                case 5 -> result += "D";
                case 6 -> result += "DC";
                case 7 -> result += "DCC";
                case 8 -> result += "DCCC";
                case 9 -> result += "CM";
            }
            number = number - (100 * hundredthPlace);
        }

        if (number >= 10){
            int tenthPlace = Integer.parseInt(String.valueOf(numberString.charAt(numberString.length() - 2)));
            switch (tenthPlace){
                case 1 -> result += "X";
                case 2 -> result += "XX";
                case 3 -> result += "XXX";
                case 4 -> result += "XL";
                case 5 -> result += "L";
                case 6 -> result += "LX";
                case 7 -> result += "LXX";
                case 8 -> result += "LXXX";
                case 9 -> result += "XC";
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
