package oneliners;

import java.util.function.IntFunction;

import static oneliners.Util.countTo;

/**
 * Sum a List of Numbers
 */
public class Item2 {

  public static void main(String[] args) {
    countTo(1000).stream().reduce(Integer::sum).get();
    countTo(1000).stream().map((IntFunction<Integer>) i -> i).sum();
  }

}
