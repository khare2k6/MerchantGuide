package Schema;

import java.util.HashMap;

import Schema.SymbolMapping.Symbol;

/**
 * Created by ankit on 22/7/17.
 */

public class AlientWord {
    private String word;
    private Symbol symbol;

    private static HashMap<String, AlientWord> alientWordMap = new HashMap<String, AlientWord>();

    public AlientWord(String word, Symbol symbol) {
        this.word = word;
        this.symbol = symbol;
    }

    public String getWord() {
        return word;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public static AlientWord addNewWorld(String word, Symbol symbol) {
        return alientWordMap.put(word, new AlientWord(word, symbol));
    }

    public static AlientWord getWord(String word){
        return alientWordMap.get(word);
    }
}
