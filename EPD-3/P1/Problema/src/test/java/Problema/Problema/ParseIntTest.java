package Problema.Problema;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParseIntTest {
  @Test
  public void transformarAInt() {
	  boolean parseable = true;
	    try{
	        Integer aux=Integer.parseInt("5");
	        if(aux instanceof Integer){
	        	
	        	System.out.println("Se ha realizado correctamente");
	        }
	    }catch(NumberFormatException e){
	        parseable = false;
	    }
	  Assert.assertTrue(parseable);
	 
  }
  
  
}
