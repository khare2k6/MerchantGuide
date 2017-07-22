package Tests;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Rule.MaxRepeatation;
import Schema.SymbolMapping.Symbol;
/**
 * Created by ankit on 22/7/17.
 */

public class TestMaxRepeatationRule {

    @Test
    public void testNoRepeat(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXIV");
        try {
            assertTrue(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRepeatMaxTimes(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXIIIV");
        try {
            assertTrue(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRepeatMoreThanMax(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXIIIIV");
        try {
            assertFalse(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRepeatMoreThanMaxTwoSymbols(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXXXIIIIV");
        try {
            assertFalse(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testForAllowedTimeOccurenceWithGap(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXXIX");
        try {
            assertTrue(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testForCrossingOccurenceLimitWithGap(){
        MaxRepeatation maxRepeatRule = new MaxRepeatation("XXXIXXXX");
        try {
            assertFalse(maxRepeatRule.isPassing());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void testExceptionIsThrownForNullInput() throws Exception {
        MaxRepeatation maxRepeatRule = new MaxRepeatation(null);
        maxRepeatRule.isPassing();
    }

    @Test(expected = Exception.class)
    public void testExceptionIsThrownForEmptyInput() throws Exception {
        MaxRepeatation maxRepeatRule = new MaxRepeatation("");
        maxRepeatRule.isPassing();
    }
}
