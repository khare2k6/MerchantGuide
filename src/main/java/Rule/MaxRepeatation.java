package Rule;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import Schema.SymbolMapping.Symbol;

/**
 * Created by ankit on 22/7/17.
 */

public class MaxRepeatation extends Rule {
    String input;
    private static HashMap<Symbol,Integer> symbols = new HashMap<Symbol,Integer>();

    static{
        symbols.put(Symbol.I,3);
        symbols.put(Symbol.X,3);
        symbols.put(Symbol.C,3);
        symbols.put(Symbol.M,3);
    }

    public MaxRepeatation(String input) {
        this.input = input;
    }

    @Override
    public boolean isPassing() throws Exception{
        boolean isPassing = true;
        if(!super.isValidInput(this.input)){
            throw new Exception(MaxRepeatation.class.getSimpleName() + " invalid input:" + input);
        }

        Iterator it = symbols.entrySet().iterator();

        //loop through symbol map of this rule and for each rule check if frequency of max
        //repeatation is broken in the input string.
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            String symbol = ((Symbol)pair.getKey()).name();
            int freq = (int) pair.getValue();

            // create a new substring stating the rule for respective symbol i.e.
            // if X is symbol and frequescy is 3, so create a new string as XXXX and look if this
            // substring is present in input string
            StringBuilder lookForSubstring = new StringBuilder();
            for(int i=0;i<freq+1;i++){
                lookForSubstring.append(symbol);
            }
            int index = input.indexOf(lookForSubstring.toString());
            if(index != -1){
                isPassing = false;
            }

        }
        return isPassing;
    }
}
