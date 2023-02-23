package com.ll.level0.p120817;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("배열 3개를 넣었을 때의 평균값은 3")
    void t1() { assertThat(new com.ll.level0.p120817.Solution().solution(new int[] {10,20,30})).isEqualTo(20);}

    @Test
    @DisplayName("배열 10개를 넣었을 때의 평균값은 5.5")
    void t2() { assertThat(new com.ll.level0.p120817.Solution().solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);}

    @Test
    @DisplayName("배열 11개를 넣었을 때의 평균값은 94.0")
    void t3() { assertThat(new com.ll.level0.p120817.Solution().solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);}

}
