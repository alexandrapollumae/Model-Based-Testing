package com.plussid;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

import java.util.Random;

import static org.junit.Assert.assertEquals;


@GraphWalker(value = "random(edge_coverage(100))", start = "v_Pos")
public class AnotherSmallTest extends ExecutionContext implements EvalTest {

  StringBuilder input = new StringBuilder();
  int expected = 0;
  Random rnd = new Random();

  private void check() {
    System.out.printf("Checking %s (expected %d).\n", input.toString(), expected);
    assertEquals(expected, Eval.eval(input.toString()));
  }

  @Override
  public void e_Op() {
    input.append("+");
  }

  @Override
  public void e_Num() {
    int i = rnd.nextInt(200)-100;
    input.append(i);
    expected += i;
  }

  @Override
  public void e_Space() {
    input.append(' ');
  }

  @Override
  public void v_expectOp() {
    check();
  }

  @Override
  public void v_Pos() {
    check();
  }

  @Override
  public void e_Minus() {
    input.append("-");
  }

  @Override
  public void v_Neg() {
    check();
  }

  @Override
  public void e_NegNum() {
    int i = rnd.nextInt(200)-100;
    input.append(i);
    expected -= i;
  }
}
