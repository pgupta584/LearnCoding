package sorting;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortString
{
    public static void main(String[] args)
    {
        String s = "Pankaj Gupta";
        /** Using inBuild method**/
        String originalString = s.toLowerCase();
        char[] a = originalString.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}
