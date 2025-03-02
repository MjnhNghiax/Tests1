package DeMau1;

public class SoNguyen {
    public static int sumArray(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("Mảng không được null");
        }
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
