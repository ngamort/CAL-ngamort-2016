package Problema.Problema;
import java.lang.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatValueTest {
	@Test
	  public void floatObjectToFloat() {
		 boolean parseable = true;
		    try{
		        Float var1= new Float(2.5);
		    	float aux = var1.floatValue();
		    	
		        if(aux ==(float) 2.5){
		        	
		        	System.out.println("Se ha realizado correctamente");
		        }
		    }catch(NumberFormatException e){
		        parseable = false;
		    }
		  Assert.assertTrue(parseable);
	  }
	
	@Test 
	  public void floatObjectToFloatcoma() {
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
