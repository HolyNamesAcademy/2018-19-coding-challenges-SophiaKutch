package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
    int small = a;
    int medium = b;
    int large = c;
    int difference =0;

        if(b < a && b < c) {
            small = b;
            if (a < c) {
                medium = a;
                large = c;
            }
            if (c < a) {
                medium = c;
                large = a;
            }
        }
        if(c < a && c < b){
            small = c;
            if(a < b){
                medium = a;
                large = b;
            }
            if(b < a){
                medium = b;
                large = a;
            }
        }
        difference= medium - small;
        if(large - medium == difference)
            return true;


        return false;
    }
}
