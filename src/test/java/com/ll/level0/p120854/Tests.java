package com.ll.level0.p120854;

import com.ll.level0.p120854.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests {

    @Test
    @DisplayName("[We, are, the, world!]가 입력되었을 때 결과는 [2, 3, 3, 6]")
    void t1() {
        assertThat(new com.ll.level0.p120854.Solution().solution(new String[] {"We", "are", "the", "world!"})).isEqualTo(new int[] {2, 3, 3,6});
    }

    @Test
    @DisplayName("null값이 들어왔을 때 결과는 빈 배열 반환")
    void t2() {
        assertThat(new com.ll.level0.p120854.Solution().solution(new String[] {})).isEqualTo(new int[] {});
    }

}
