package p2910;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @DisplayName("input 1")
    @Test
    void solution_test1() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);

        // when
        Main.solution(integerList);

        // then
    }

    @DisplayName("input 2")
    @Test
    void solution_test2() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(1);
        integerList.add(1);

        // when
        Main.solution(integerList);

        // then
    }

    @DisplayName("input 3")
    @Test
    void solution_test3() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(33);
        integerList.add(11);
        integerList.add(77);
        integerList.add(54);
        integerList.add(11);
        integerList.add(25);
        integerList.add(25);
        integerList.add(33);

        // when
        Main.solution(integerList);

        // then
    }
}