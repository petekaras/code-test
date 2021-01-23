package practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PeaksTest {
    @Test
    public void simple(){
        int[] in = new int[]{1,2,3,6,4,1,2,3,2,1};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(3,7),
                "peaks", List.of(6,3)
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void ignoreOnEdge(){
        int[] in = new int[]{3,2,3,6,4,1,2,3,2,1,2,3};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(3,7),
                "peaks", List.of(6,3)
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void plateau(){
        int[] in = new int[]{3,2,3,6,4,1,2,3,2,1,2,2,2,1};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(3,7,10),
                "peaks", List.of(6,3,2)
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void plateauOnEdge(){
        int[] in = new int[]{3,2,3,6,4,1,2,3,2,1,2,2,2};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(3,7),
                "peaks", List.of(6,3)
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void complex(){
        int[] in = new int[]{15, 19, 15, 6, -3, -4, 16, 10, 14, 18, -4, 17, 12, 12, 3, 7, 7, 19, 1, 0, 3, 12, -2};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(1, 6, 9, 11, 17, 21),
                "peaks", List.of(19, 16, 18, 17, 19, 12)
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void empty(){
        int[] in = new int[]{};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(),
                "peaks", List.of()
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }

    @Test
    public void notEnoughNumbers(){
        int[] in = new int[]{2,3};
        Map<String, List<Integer>> expected = Map.of(
                "pos", List.of(),
                "peaks", List.of()
        );

        Map<String, List<Integer>> actual = Peaks.getPeaks(in);
        assertEquals(expected, actual);
    }
}