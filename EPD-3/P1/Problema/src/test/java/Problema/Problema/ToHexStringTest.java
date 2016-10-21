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

}
