package org.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class tinhTongTest {
    private tinhTong tong;
    @BeforeEach
    public void setUp() {
       tong = new tinhTong();
    }
    @Test
    public void test() {
        int sum = tong.calculateEvenSum(8);
        Assertions.assertEquals(8, sum);
    }
    @Test
    public void test1() {
        int sum = tong.calculateEvenSum(50);
        Assertions.assertEquals(168, sum);
    }
    @Test
    public void test2() {
        int sum = tong.calculateEvenSum(0);
        Assertions.assertEquals(0, sum);
    }
    @Test
    public void test3() {
        int sum = tong.calculateEvenSum(51);
        Assertions.assertEquals(168, sum);
    }
    @Test
    public void test4() {
        int sum = tong.calculateEvenSum(-5);
        Assertions.assertEquals(0, sum);
    }

}
