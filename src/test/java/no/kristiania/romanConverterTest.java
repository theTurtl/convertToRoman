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

    private Object toRoman(int number) {
        String result = "";
        if (number == 1) {
            result = "I";
        }
        if (number == 2) {
            result = "II";
        }
        if (number == 3) {
            result = "III";
        }
        return result;
    }

}
