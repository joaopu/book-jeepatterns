package book.jeepatterns.factory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import book.jeepatterns.model.BasicEngineering;
import book.jeepatterns.model.Engineering;
import book.jeepatterns.qualifier.ElectronicQualifier;

public class EngineeringProducer {
	
	@Produces
	@ElectronicQualifier
	public Engineering getEngineering (InjectionPoint injectionPoint ) {
		return new BasicEngineering();
		
	}

}
