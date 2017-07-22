package Rule;

/**
 * Created by ankit on 22/7/17.
 */

public abstract class Rule {
    /**
     * Implementor should throw exception if this input is invalid.
     * @param input
     * @throws Exception
     */
    public boolean isValidInput(Object input){
        if (input == null) {
            return false;
        }

        if (input instanceof String) {
            String in = (String) input;
            return !(in.isEmpty());
        }
        //Todo:: what other cases?
        return false;
    }
    public abstract boolean isPassing() throws Exception;

}
