package DeMau1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoNguyenTest {
    @Test
    void testSumArray_NormalCase() {
        int[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertEquals(15, SoNguyen.sumArray(numbers));
    }

    @Test
    void testSumArray_EmptyArray() {
        int[] numbers = {};
        Assertions.assertEquals(0, SoNguyen.sumArray(numbers));
    }

    @Test
    void testSumArray_NullArray() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SoNguyen.sumArray(null);
        });
        Assertions.assertEquals("Mảng không được null", exception.getMessage());
    }

    @Test
    void testSumArray_NegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4};
        Assertions.assertEquals(-10, SoNguyen.sumArray(numbers));
    }

    @Test
    void testSumArray_LargeNumbers() {
        int[] numbers = {1000000, 2000000, 3000000};
        Assertions.assertEquals(6000000, SoNguyen.sumArray(numbers));
    }
}
