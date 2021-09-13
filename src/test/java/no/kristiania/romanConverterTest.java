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
            if (number == 4) {
                result = "IV";
                input -= 4;
            }
            if (number == 5) {
                result = "V";
                input -= 5;
            }
            if (number == 9) {
                result += "IX";
                input -= 9;
            }

            if (input >= 10) {
                result += "X";
                input -= 10;
            }
        }

        return result;
    }

}
