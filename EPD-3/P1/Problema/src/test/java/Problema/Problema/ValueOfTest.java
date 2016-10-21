package Problema.Problema;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueOfTest {
  @Test
  public void comprobarValorInt() {
	  boolean parseable = true;
	  try{
	        Integer aux=Integer.valueOf(16);
	        if(aux instanceof Integer){
	        	
	        	System.out.println("Se ha realizado correctamente");
	        }
	    }catch(NumberFormatException e){
	        parseable = false;
	    }
	  Assert.assertTrue(parseable);
	  Assert.assertTrue(16==Integer.valueOf(16));
  }
  
}
