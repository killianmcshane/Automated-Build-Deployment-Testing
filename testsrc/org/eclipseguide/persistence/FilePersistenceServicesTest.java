package org.eclipseguide.persistence;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilePersistenceServicesTest {

	private FilePersistenceServices services=null;
	private Vector v1=null;
	String s1 = "\"1\",\"One\",\"Two\",\"Three\"";


	@Before
	public void setUp() throws Exception {
		services=new FilePersistenceServices();
        v1 = new Vector();
        v1.addElement("One");
        v1.addElement("Two");
        v1.addElement("Three");

	}

	@After
	public void tearDown() throws Exception {
		services=null;
		v1 = null;  // release v1

	}

	@Test
	public void testWrite() {
		assertTrue("NOT WRITTEN???", 
		          services.write 
		                  ("TestTable", 1, v1));
	}

	@Test
	public void testRead() {
		services.write("TestTable", 1, v1);
	    Vector w =  
	       services.read("TestTable", 1);
	    assertEquals(v1,w);
	}
	
	@Test
	public void testVector2String()
	{
	   assertEquals(s1,       
	     FilePersistenceServices.vector2String(v1,1));
	}

	@Test
	 public void testString2Vector()
	 {
	   assertEquals(v1,
	    FilePersistenceServices.string2Vector(s1));
	 }
	
	@Test
	public void testGetKey()
	{
	    assertEquals(1,
	    services.getKey(s1));
	}

	
	
}
