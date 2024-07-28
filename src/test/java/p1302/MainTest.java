package p1302;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @DisplayName("1번 테스트")
    @Test
    void test_1() {
        // given
        List<String> inputList = new ArrayList<>();
        inputList.add("top");
        inputList.add("top");
        inputList.add("top");
        inputList.add("top");
        inputList.add("kimtop");

        // when
        String answer = Main.solution(inputList);

        // then
        assertThat(answer).isEqualTo("top");
    }

    @DisplayName("2번 테스트")
    @Test
    void test_2() {
        // given
        List<String> inputList = new ArrayList<>();
        inputList.add("table");
        inputList.add("chair");
        inputList.add("table");
        inputList.add("table");
        inputList.add("lamp");
        inputList.add("door");
        inputList.add("lamp");
        inputList.add("table");
        inputList.add("chair");
        // when
        String answer = Main.solution(inputList);

        // then
        assertThat(answer).isEqualTo("table");
    }

    @DisplayName("3번 테스트")
    @Test
    void test_3() {
        // given
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("b");
        inputList.add("b");
        inputList.add("b");
        // when
        String answer = Main.solution(inputList);

        // then
        assertThat(answer).isEqualTo("a");
    }

    @DisplayName("4번 테스트")
    @Test
    void test_4() {
        // given
        List<String> inputList = new ArrayList<>();
        inputList.add("soul");
        // when
        String answer = Main.solution(inputList);

        // then
        assertThat(answer).isEqualTo("soul");
    }

    @DisplayName("5번 테스트")
    @Test
    void test_5() {
        // given
        List<String> inputList = new ArrayList<>();
        inputList.add("b");
        inputList.add("a");
        // when
        String answer = Main.solution(inputList);

        // then
        assertThat(answer).isEqualTo("a");
    }


}