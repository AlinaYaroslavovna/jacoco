import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    public void testFindMaxUpdatesCurrentMax() {
        StatisticsService service = new StatisticsService();

        // Тестовый набор данных
        long[] incomes1 = {5, 15, 10, 20, 25};
        long expectedMax1 = 25; // Ожидаемое максимальное значение
        long actualMax1 = service.findMax(incomes1);
        assertEquals(expectedMax1, actualMax1);

        long[] incomes2 = {30, 20, 40, 10};
        long expectedMax2 = 40; // Ожидаемое максимальное значение
        long actualMax2 = service.findMax(incomes2);
        assertEquals(expectedMax2, actualMax2);

        long[] incomes3 = {0, -10, -20, -5};
        long expectedMax3 = 0; // Ожидаемое максимальное значение
        long actualMax3 = service.findMax(incomes3);
        assertEquals(expectedMax3, actualMax3);

        long[] incomes4 = {-1, -2, -3};
        long expectedMax4 = -1; // Ожидаемое максимальное значение
        long actualMax4 = service.findMax(incomes4);
        assertEquals(expectedMax4, actualMax4);
    }
}
