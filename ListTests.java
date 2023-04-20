import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void Merge(){
      String[] input1s = {"a","b","c","d","e"};
      String[] input2s = {"a"};
      String[] outputs = {"a","a","b","c","d","e"};
      List<String> input1 = Arrays.asList(input1s);
      List<String> input2 = Arrays.asList(input2s);
      List<String> expect = Arrays.asList(outputs);
      assertArrayEquals(expect.toArray(),ListExamples.merge(input1,input2));
    }
}
