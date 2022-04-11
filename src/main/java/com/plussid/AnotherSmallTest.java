package com.plussid;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

import java.util.Random;

import static org.junit.Assert.assertEquals;


//@GraphWalker(value = "random(edgecoverage(100))", start = "v_Positive")
public class AnotherSmallTest extends ExecutionContext implements EvalTest {

  StringBuilder input = new StringBuilder();
  int expected = 0;
  Random rnd = new Random();

  private void check() {
    int actual = Eval.eval(input.toString());
    System.out.printf("Checking %s (expected %d, actual %d).\n", input.toString(), expected, actual);
    assertEquals(expected, actual);
  }

  @Override
  public void e_MinusOperator() {
    input.append("-");
  }

  @Override
  public void v_Expected() {
    check();
  }

  @Override
  public void e_Addition() {
    int i = rnd.nextInt(200)-100;
    input.append(i);
    expected += i;
  }

  @Override
  public void e_PlusOperator() {

  }

  @Override
  public void e_Subtraction() {

  }

  @Override
  public void v_Positive() {
    check();
  }

  @Override
  public void v_Negative() {
    check();
  }
}
