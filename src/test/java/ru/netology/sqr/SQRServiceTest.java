package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'rootOfNumber 100 to 200',100,200,5",
                        "'rootOfNumber 200 to 300',200,300,3",
                        "'rootOfNumber 300 to 500',300,500,5",
                        "'rootOfNumber 500 to 700',500,700,4",
                        "'rootOfNumber 700 to 1000',700,1000,5"})
    void shouldRootOfNumber(String testName, int minNumber, int maxNumber, int expected) {
        SQRService service = new SQRService();

        long actual =service.rootOfNumber(minNumber, maxNumber);
        assertEquals(expected, actual);
    }

}