package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UtilTest 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("DIES IST EIN TEST");
        assertTrue( true );
        
       
        assertTrue( Util.istErstesHalbjahr(1));
        assertTrue( Util.istErstesHalbjahr(4));
        assertFalse( Util.istErstesHalbjahr(9));
      
    }
}
