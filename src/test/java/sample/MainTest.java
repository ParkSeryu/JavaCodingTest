package sample;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void solutionTest() {
        Main main = new Main();
        int solution = main.solution(3, 5);

        assertThat(solution).isEqualTo(8);
    }
}