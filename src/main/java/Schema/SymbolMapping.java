package Schema;

import java.util.HashMap;

/**
 * Created by ankit on 22/7/17.
 */

public class SymbolMapping {
    /**
     * Enum denoting roman alternative to their integer values
     * <li>I 1</li>
     * <li>V 5</li>
     * <li>X 10</li>
     * <li>L 50</li>
     * <li>C 100</li>
     * <li>D 500</li>
     * <li>M 1000</li>
     */
    public enum Symbol {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private static HashMap<Integer,Symbol> valuesMap = new HashMap<Integer,Symbol>();
        private static HashMap<String, Symbol> stringMap = new HashMap<String, Symbol>();

        static{
            for(Symbol sym : Symbol.values()){
                valuesMap.put(sym.getValue(),sym);
                stringMap.put(sym.name(), sym);
            }
        }

        /**
         * Returns {@link Symbol} for given integer value
         * @param value
         * @return
         */
        public static Symbol symbolOf(int value){
            return valuesMap.get(value);
        }

        public static Symbol symbolOf(String string) {
            return stringMap.get(string);
        }
        private int value;
        private Symbol(int val){
            value = val;
        }

        public int getValue(){return value;}
    }
}
