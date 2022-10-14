package DesignPatternLearning.DesignPatternLearning.Facade;
/**
 * 
 * @author ashish
 * Problem Statement:
 * I am building an application for a lift.
	The lift contains various components like plc, HMI, alarm etc.
	Using the facade pattern create a facade class that provides a simplified interface to the above set of
	interface(s).
 *	Solution: ElevatorFeatureFacade class implements the required workflow methods seggarigating the methods from
 *	PLC and HMI classes.
 */
public class MainClass {
	
	public static void main(String args[]) {
		PLC plc = new PLC();
		HMI hmi = new HMI();
		ElevatorFeatureFacade elevatorFacade = new ElevatorFeatureFacade(plc, hmi);
		
		elevatorFacade.gotoFloorNum(5);
		elevatorFacade.ringAlarm();
		elevatorFacade.stopElevator();
	}

}
