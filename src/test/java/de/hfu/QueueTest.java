package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class QueueTest 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Queue TEST");
        
        //Test einfuegen und alte Werte ueberschreiben
        Queue q = new Queue(3);
        for(int i=0; i<100; i++)
        	q.enqueue(i);
        
        //Bis hierhin gab es kein fehler. Gebe deswegen true aus
        assertTrue( true );
        
        //Aus der Queue werte entnehmen
        
        for(int i=0; i<3; i++)
        	System.out.println(q.dequeue());
        
      //Bis hierhin gab es kein fehler. Gebe deswegen true aus
        assertTrue( true );
        
        //Test mehr als 3 werte nehmen
     //   q.dequeue();
        
      
    }
    public void neuerFall(){
    	System.out.println("noch mehr tests");
    	//never reached
    }
}
