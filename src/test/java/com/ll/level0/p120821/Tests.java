package com.ll.level0.p120821;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5]가 입력되었을 때 결과는 [5, 4, 3, 2, 1]")
    void t1() {
        assertThat(new Solution().solution(new int[] {1,2,3,4,5})).isEqualTo(1);
    }

    @Test
    @DisplayName("[1,2,3,3,3,4]이 입력되었을 때 결과는 3")
    void t2() {
        assertThat(new Solution().solution(new int[] {1,2,3,3,3,4})).isEqualTo(3);
    }


}
