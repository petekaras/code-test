package practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SnailTest {


    private Snail snail = new Snail();

    @Test
    void simple3By3Array() {
        final int[] expectedResult = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[] result = snail.snail(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void simple1DArray() {
        final int[] expectedResult = new int[]{1, 2, 3, 4, 5};
        int[] result = snail.snail(new int[][]{{1, 2, 3, 4, 5}});

        assertThat(result).isEqualTo(expectedResult);
    }
}
