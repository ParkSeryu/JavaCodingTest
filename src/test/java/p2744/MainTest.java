package p2744;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import sort.p2744.Main;


class MainTest {

    @Test
    void solutionTest() {
        // given
        Main main = new Main();
        String str = "WrongAnswer";

        // when
        String answer = main.solution(str);

        // then
        assertThat(answer).isEqualTo("wRONGaNSWER");
    }
}