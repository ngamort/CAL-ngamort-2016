package Problema.Problema;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToStringTest {
  @Test
  public void cadenaInteger() {
	  Integer i= new Integer(16);
	  String aux=i.toString();
	  Assert.assertTrue(aux.equals("16"));
	 
  }
 
}
