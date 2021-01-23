package practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StocksTest {
    @Test
    void one() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertThat(Stocks.maxProfit(prices)).isEqualTo(5);
    }

    @Test
    void twoTheSame() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4, 3, 5, 10, 2, 11};
        assertThat(Stocks.maxProfit(prices)).isEqualTo(9);
    }

    @Test
    void none() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        assertThat(Stocks.maxProfit(prices)).isEqualTo(0);
    }
}