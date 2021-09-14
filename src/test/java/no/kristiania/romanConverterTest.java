package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanConverterTest {
    @Test
    void convertOneToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void convertTwoToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void convertThreeToIII() {
        assertEquals("III", toRoman(3));
    }
    

    @Test
    void convertFourToIV() {
        assertEquals("IV", toRoman(4));
    }

    @Test
    void convertFiveToV() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void convertNineToIX() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void convertTenToX() {
        assertEquals("X", toRoman(10));
    }

    @Test
    void convert13ToXIII() {
        assertEquals("XIII", toRoman(13));
    }

    @Test
    void convert19ToXIX() {
        assertEquals("XIX", toRoman(19));
    }

    @Test
    void convert20ToXX() {
        assertEquals("XX", toRoman(20));
    }

    @Test
    void convert50ToL() {
        assertEquals("L", toRoman(50));
    }

    @Test
    void convert58ToLVIII() {
        assertEquals("LVIII", toRoman(58));
    }

    @Test
    void convert100ToC() {
        assertEquals("C", toRoman(100));
    }

    @Test
    void convert500ToD() {
        assertEquals("D", toRoman(500));
    }

    @Test
    void convert1000ToM() {
        assertEquals("M", toRoman(1000));
    }

    private Object toRoman(int number) {
        String result = "";
        int input = number;

        while(input > 0){
            if(input <= 3) {
                for (int i = 0; i < input; i++) {
                    result += "I";
                    input -= 1;
                }
            }
            if (input == 4) {
                result += "IV";
                input -= 4;
            }
            if (input >= 5 && input < 9) {
                result += "V";
                input -= 5;
            }
            if (input == 9) {
                result += "IX";
                input -= 9;
            }

            if (input >= 10 && input < 50) {
                result += "X";
                input -= 10;
            }

            if (input >= 50 && input < 100) {
                result += "L";
                input -= 50;
            }

            if (input >= 100 && input < 500) {
                result += "C";
                input -= 100;
            }

            if (input >= 500) {
                result += "D";
                input -= 500;
            }
        }

        return result;
    }

}
