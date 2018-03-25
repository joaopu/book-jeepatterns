package book.jeepatterns.facade;

import javax.enterprise.event.Observes;

/**
 * Session Bean implementation class StatisticalFacadeImpl
 */
//@Stateless
//@LocalBean
public class StatisticalFacadeImpl {
    
	//@Asynchronous
    public void control (@Observes String enrolment ) {
    	System.out.println("This enrollment is asking for a test revision : " + enrolment 
    			);
    	// Here we can persist this information, for example.
    }

}
