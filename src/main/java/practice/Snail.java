package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
 * array = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * snail(array) = [1,2,3,6,9,8,7,4,5]
 */
public class Snail {
    public int[] snail(int[][] grid) {
        int leftLimit = 0;
        int upperLimit = 0;
        int rightLimit = grid[0].length;
        int lowerLimit = grid.length;

        List<Integer> result = new ArrayList<>();

        while (conditionsAreMet(leftLimit, upperLimit, rightLimit, lowerLimit)) {

            for (int i = leftLimit; i < rightLimit; i++) {
                result.add(grid[upperLimit][i]);
            }
            upperLimit++;

            if (conditionsAreMet(leftLimit, upperLimit, rightLimit, lowerLimit)) {
                for (int i = upperLimit; i < lowerLimit; i++) {
                    result.add(grid[i][rightLimit]);
                }
                rightLimit--;
            }


            if (conditionsAreMet(leftLimit, upperLimit, rightLimit, lowerLimit)) {
                for (int i = rightLimit; i > leftLimit; i--) {
                    result.add(grid[lowerLimit][i]);
                }
                lowerLimit--;
            }

            if (conditionsAreMet(leftLimit, upperLimit, rightLimit, lowerLimit)) {
                for (int i = lowerLimit; i > upperLimit; i--) {
                    result.add(grid[i][leftLimit]);
                }
                leftLimit++;
            }
        }

        int[] ints = result.stream().mapToInt(i -> i).toArray();
        return ints;
    }

    private boolean conditionsAreMet(int leftLimit, int upperLimit, int rightLimit, int lowerLimit) {
        return leftLimit < rightLimit && upperLimit < lowerLimit;
    }
}
