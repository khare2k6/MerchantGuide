package Tests;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Schema.SymbolMapping.Symbol;
/**
 * Created by ankit on 22/7/17.
 */

public class TestSymbols {

    @Test
    public void romanSymValue(){
        assertEquals(50,Symbol.L.getValue());
    }

    @Test
    public void symbolForValue() {
        assertEquals(Symbol.M,Symbol.symbolOf(1000));
    }

    @Test
    public void symbolForUndefinedIntValue(){
        Assert.assertNull(Symbol.symbolOf(2000));
    }

    @Test
    public void symbolForString() {
        assertEquals(Symbol.M, Symbol.symbolOf("M"));
    }
}
