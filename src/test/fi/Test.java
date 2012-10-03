package test.fi;

import test.fi.impl.CVServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * User: Malli
 * Date: 3.4.2012
 * Time: 18.08
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    
    public static void main (String [] args) {
        System.out.println("Hello world!!");
        
        CVService cvService = new CVServiceImpl();
        CV cv = cvService.getCV();
        System.out.println(cv.getName());
    }
}
