import Schema.SymbolMapping.Symbol;

public class Solution{
	public static void main(String[] argv){
		System.out.println("Hellow");
		System.out.println(" value of M="+ Symbol.M.getValue());
		System.out.println(" value of 50="+ Symbol.symbolOf(50));
		System.out.println(" value of 50&1000"+ Symbol.symbolOf(50)+ Symbol.symbolOf(1000));
	}
}
