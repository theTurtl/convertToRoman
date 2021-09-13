package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanConverterTest {
    @Test
    void convertOneToI() {
        assertEquals("I", toRoman(1));
    }

    private Object toRoman(int i) {
        if (i == 1) {
            return "I";
        }
    }

}
