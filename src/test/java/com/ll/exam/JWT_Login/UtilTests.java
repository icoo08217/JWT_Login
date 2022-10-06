package com.ll.exam.JWT_Login;

import com.ll.exam.JWT_Login.util.Util;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class UtilTests {

    @Test
    @DisplayName("Util.mapOf")
    void Test1() {
        Map<String , Integer> ages = Util.mapOf("영수", 22, "철수", 33, "영희", 44 , "민수" , 55);

        assertThat(ages.get("민수")).isEqualTo(55);
        assertThat(ages.get("영수")).isEqualTo(22);
    }
}
