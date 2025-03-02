package DeMau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoNguyen {
    public static int sumOddNumbers(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phải là số nguyên dương");
        }
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    @Test
    void testValidInput() {
        assertEquals(1,  SoNguyen.sumOddNumbers(1)); // 1
        Assertions.assertEquals(9, SoNguyen.sumOddNumbers(5)); // 1+3+5 = 9
        assertEquals(25, SoNguyen.sumOddNumbers(9)); // 1+3+5+7+9 = 25
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> SoNguyen.sumOddNumbers(-5));
        assertThrows(IllegalArgumentException.class, () -> SoNguyen.sumOddNumbers(0));
    }
}

