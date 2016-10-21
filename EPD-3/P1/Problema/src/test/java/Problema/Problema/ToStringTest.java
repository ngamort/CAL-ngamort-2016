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
  @Test
  public void cadenaFloat() {
	  Float i= new Float(16.5);
	  String aux2=i.toString();
	  Assert.assertTrue(aux2.equals("16.5"));
  }
}
