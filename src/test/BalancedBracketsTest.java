package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString(){
        //Test case ---> ""
        //
        assertTrue(BalancedBrackets.hasBalancedBrackets( ""));
    }

    @Test
    public void singlePairOfBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[]"));
    }

    @Test
    public void testThreePairsOf
}
