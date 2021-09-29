package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"В диапазоне от 200 до 300,200,300,3", "В диапазоне от 100 до 200,100,200,5", "В диапазоне о " +
            "т 100 до 300,100,300,8"})
    void shouldCalculateSquare(String testName, int minSquare, int maxSquare, int expected) {
//        создаем экземпляр тестового метода
        SQRService service = new SQRService();
        // вызываем целевой метод:
        long actual = service.calculateSquareNumber(minSquare, maxSquare);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
//проверка
}