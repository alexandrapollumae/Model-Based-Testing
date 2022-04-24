package com.HtmlStrip;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import static org.junit.Assert.assertEquals;

// bv@GraphWalker(value = "random(edge_coverage(100)&&reached_vertex(v_INI))", start = "v_INI")
public class StripMachineTest extends ExecutionContext {

  StringBuilder actual = new StringBuilder();
  StringBuilder expected = new StringBuilder();
  HtmlStripMachine machine = new HtmlStripMachine();

}
