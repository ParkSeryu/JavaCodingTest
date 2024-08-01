package sort.p1931;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @DisplayName("input test 1")
    @Test
    void test_1() {
        // given
        int[][] arr = {
                {1, 4},
                {3, 5},
                {0, 6},
                {5, 7},
                {3, 8},
                {5, 9},
                {6, 10},
                {8, 11},
                {8, 12},
                {2, 13},
                {12, 14},
        };

        // when
        int solution = Main.solution(arr);

        // then
        assertThat(solution).isEqualTo(4);
    }

    @DisplayName("input test 2")
    @Test
    void test_2() {
        // given
        int[][] arr = {
                {1, 4},
                {3, 5},
                {4, 7},
                {7, 11},
                {9, 11},
                {9, 9},
                {8, 9},
                {9, 9},
                {8, 12}
        };

        // when
        int solution = Main.solution(arr);

        // then
        assertThat(solution).isEqualTo(6);
    }

}