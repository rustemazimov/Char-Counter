package models;

/**
 * @author Rustem Azimov
 */
public class CharCounterMachine {
    private int numCount, upperCaseCount, lowerCaseCount, specialCount;

    /**
     * Check whether given char represents a digit or not
     * @param c specific character for testing
     * @return
     *      returns true if c is a digit
     *      if not returns false
     */
    private boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * Check whether given char represents an upper-case letter(e.g. 'A', 'B' .etc)  or not
     * @param c specific character for testing
     * @return
     *      returns true if c is an upper-case letter
     *      if not returns false
     */
    private boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /**
     * Check whether given char represents an lower-case letter(e.g. 'A', 'B' .etc)  or not
     * @param c specific character for testing
     * @return
     *      returns true if c is an lower-case letter
     *      if not returns false
     */
    private boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    /**
     * Prepares detailed information about
     * character counting and division operations
     * @param text given text (In this project 'user input')
     * @return
     *      returns detailed information about
     *      character division in the String form
     *      e.g.
     *          Words: 5
     *          All chars: 7
     *             Digits: 12
     *             Upper Case Letters: 14
     *             Lower Case Letters: 313
     *             Special Characters: 124000
     */
    public String getCharFrequenciesInfo(String text) {
        if(text.isEmpty())
        {
            /*
             * If user input is empty text
             * return results text that contains nothing
             */
            return "";
        }

        /*
         * Call countCharFrequency(c : char) for each char
         * of given text as the given paramater
         */
        for(int i = 0;  i < text.length(); i++) {
            countCharFrequency(text.charAt(i));
        }
        return "Words: " + countWords(text) + "\n" +
                "All chars: " + text.length() + "\n" +
                "   Digits: " + this.numCount + "\n" +
                "   Upper Case Letters: " + this.upperCaseCount + "\n" +
                "   Lower Case Letters: " + this.lowerCaseCount + "\n" +
                "   Special Characters: " + this.specialCount;
    }

    /**
     * Checks whether given character is
     * digit, number, .etc
     * and increment specific groups count
     * for the result of multiple checking
     * @param c  specific character in order to test it with
     *           isNum(c : char)
     *           isLowerCase(c : char)
     *           isLowerCase(c : char)
     */
    private void countCharFrequency(char c) {
        if(isNum(c))
        {
            this.numCount++;
        }
        else if(isNum(c))
        {
            this.upperCaseCount++;
        }
        else if(isLowerCase(c))
        {
            this.lowerCaseCount++;
        }
        else
        {
            /*
             * If all checking method fail(if all return false)
             * it means that checking character is a speciial char(e.g. ';', ',', ' ' .etc)
             */
            this.specialCount++;
        }
    }

    /**
     * Determines how many words exist in the given text
     * and returns it
     * @param text given text (In this project 'user input')
     * @return
     *      returns a number that describes
     *      how many words exist in the given text
     */
    private int countWords(String text) {
        int count = 0;
        text = text.trim();
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ')
            {
                count++;
                for (int j = i + 1; j < text.length(); j++)   {
                    if(text.charAt(j) != ' ')
                    {
                        break;
                    }
                    i = j;
                }
            }
        }
        return count  + 1;
    }

    /**
     * Reset all fields
     * that contains counts for each character group
     * Initializes 0 for further use
     */
    public void resetCounts() {
        this.numCount = 0;
        this.upperCaseCount = 0;
        this.lowerCaseCount = 0;
        this.specialCount = 0;
    }
}
