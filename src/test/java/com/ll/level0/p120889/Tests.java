package com.ll.level0.p120889;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3]이 입력되었을 때의 결과는 2")
    void t1() {
        assertThat(new Solution().solution(new int[] {1,2,3})).isEqualTo(2);
    }

}
