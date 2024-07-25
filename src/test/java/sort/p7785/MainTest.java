package sort.p7785;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    Main main = new Main();

    @DisplayName("tc1")
    @Test
    void test1() {
        // given
        String[] list = {"Baha enter", "Askar enter", "Baha leave", "Artem enter"};

        // when
        String[] answer = main.solution(list);
        System.out.println(Arrays.toString(answer));

        // then
        assertThat(answer).isEqualTo(new String[]{"Askar", "Artem"});
    }

    @DisplayName("tc2")
    @Test
    void test2() {
        // given
        String[] list = {
                "Carol enter",
                "Alice enter",
                "Dave enter",
                "Carol leave",
                "Erin enter",
                "Erin leave",
                "Bob enter",
                "Carol enter",
                "Bob leave"
        };

        // when
        String[] answer = main.solution(list);
        System.out.println(Arrays.toString(answer));

        // then
        assertThat(answer).isEqualTo(new String[]{"Dave", "Carol", "Alice"});
    }

}