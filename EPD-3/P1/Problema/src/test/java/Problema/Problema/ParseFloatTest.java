package Problema.Problema;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParseFloatTest {
	@Test
	  public void transformarAFloat() {
		 boolean parseable = true;
		    try{
		        Float aux=Float.parseFloat("5.2");
		        if(aux instanceof Float){
		        	
		        	System.out.println("Se ha realizado correctamente");
		        }
		    }catch(NumberFormatException e){
		        parseable = false;
		    }
		  Assert.assertTrue(parseable);
	  }
	
	@Test
	  public void transformarAFloatComa() {
		 boolean parseable = true;
		    try{
		        Float aux=Float.parseFloat("5,2");
		        if(aux instanceof Float){
		        	
		        	System.out.println("Se ha realizado correctamente");
		        }
		    }catch(NumberFormatException e){
		        parseable = false;
		        System.out.println("No se ha realizado correctamente pasar a float porque hay una coma no un punto");
		    }
		  Assert.assertFalse(parseable);
	  }
}
