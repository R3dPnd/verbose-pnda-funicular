package com.harmless.intrusion;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTests {

    char[][] exampleOne = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    char[][] exampleTwo = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };

    @Test
    public void example_one_test(){
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int result = numberOfIslands.numIslands(exampleOne);
        Assert.assertEquals(1, result);
    }

    @Test
    public void example_two_test(){
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int result = numberOfIslands.numIslands(exampleTwo);
        Assert.assertEquals(3, result);
    }
}
