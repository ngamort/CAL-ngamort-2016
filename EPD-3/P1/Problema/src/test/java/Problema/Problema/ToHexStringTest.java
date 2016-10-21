package Problema.Problema;
import java.lang.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToHexStringTest {
  @Test
  public void hexadecimalInt() {
	  String hex;
	  int aux=16;
	  hex=Integer.toHexString(aux);
	  Assert.assertTrue(hex.equals("10"));
  }
  @Test
  public void hexadecimalFloat() {
	  String hex;
	  float aux2=(float)16.5;
	  hex=Float.toHexString(aux2);
	  System.out.println(hex);
	  Assert.assertTrue(hex.equals("0x1.08p4"));
  }
}
