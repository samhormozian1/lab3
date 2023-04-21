import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {4, 5, 6, 7};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{7, 6, 5, 4}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {7, 8, 9};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{9, 8, 7}, ArrayExamples.reversed(input2));
  }

@Test
public void testaverageWithoutLowest(){
  double[] input1 = {};
  double[] input2 = {1};
  double[] input3 = {2, 1, 3};
  assertEquals(2.5, ArrayExamples.averageWithoutLowest(input3), 0.001);
}
}
