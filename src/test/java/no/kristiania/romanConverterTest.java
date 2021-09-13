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

    private Object toRoman(int i) {
        String result = "";
        if (i == 1) {
            result = "I";
        }
        return result;
    }

}
