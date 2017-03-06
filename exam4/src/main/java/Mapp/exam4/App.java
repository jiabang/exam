package Mapp.exam4;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	
    	Map m=new HashMap();
    	Map sortm=new HashMap();
    	int key;
        ArrayList list=new ArrayList();
        for(int i=0;i<51;i++){
        	Random r=new Random(100);
        	list.add(r);
        }
        Iterator it=list.iterator();
        while(it.hasNext()){
        	int l=(Integer) it.next();
        	 key= (int) Math.ceil(l/10);
        	 m.put(key, l);
        }
        
    }
}
