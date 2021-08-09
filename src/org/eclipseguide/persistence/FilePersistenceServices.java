package org.eclipseguide.persistence;

import java.util.StringTokenizer;
import java.util.Vector;

public class FilePersistenceServices {
	
	public FilePersistenceServices() {
		
	}
	public boolean write(String fileName, int key, Vector <String> v)
    {
        return false; // false – because the method is not yet implemented
    }

    public Vector <String> read(String fileName, int key)
    {
        return null; // null – just to return anything
    }
	public static String vector2String(Vector <String> v, int key) {
		String s = null;
	       StringBuffer buffer = new StringBuffer();
	       // start with key in quotation marks and comma
	       buffer.append("\"" + Integer.toString(key) + "\",");
	       // add quote delimited entry 
	       // for each element in Vector v:
	       for (int i = 0; i < v.size(); i++)
	       {
	           buffer.append("\"");
	           buffer.append(v.elementAt(i));
	           buffer.append("\"");
	           if (i != (v.size() - 1)) // if i is not last
	           {
	               buffer.append(","); // Add comma in case 
	           }                       // of not last element
	       }
	       s = buffer.toString();
	       return s;
	}
	
	public static Vector <String> string2Vector(String s) {
		Vector v = new Vector();
	    // use comma and double quotation mark as delimiters
	    StringTokenizer st = new StringTokenizer(s, "\",");
	    if (st.hasMoreTokens()) {
	       st.nextToken();
	    }
	    while (st.hasMoreTokens())
	    {
	        v.addElement(st.nextToken());
	    }
	    return v;
	}
	
	public int getKey(String s) {
		int key=0;
	    StringTokenizer st = new StringTokenizer(s, "\",");
	    if (st.hasMoreTokens()) {
	    	key=Integer.parseInt(st.nextToken());
	    }
	    return(key);
	}

}
