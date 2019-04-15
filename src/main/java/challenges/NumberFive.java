package challenges;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }
        char[] chars =  word1.toLowerCase().toCharArray();

        for(char c : chars){
            int index = word2.toLowerCase().indexOf(c);
            if (index != -1){
                word2 = word2.substring(0,index) + word2.substring(index + 1, word2.length());
            }
         else{
             return false;
            }
        }
        return word2.isEmpty();
    }
}
