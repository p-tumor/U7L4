import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListAlgorithmTester
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList7 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperEnd(stringList7);
        System.out.println(stringList7);
    }
}
