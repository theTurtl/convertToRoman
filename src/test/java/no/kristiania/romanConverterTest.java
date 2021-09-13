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

    private Object toRoman(int number) {
        String result = "";
        if(number <= 3) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
        }else if (number == 4) {
            result = "IV";
        }else if (number == 5) {
            result = "V";
        }
        return result;
    }

}
