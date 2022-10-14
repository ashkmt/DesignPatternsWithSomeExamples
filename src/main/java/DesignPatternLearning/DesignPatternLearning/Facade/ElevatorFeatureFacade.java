package DesignPatternLearning.DesignPatternLearning.Facade;
/**
 * 
 * @author ashish
 * This is Facade class, having possible worflow methods using HMI and PLC class.
 *
 */
public class ElevatorFeatureFacade {

	private PLC plc;
	private HMI hmi;
	public ElevatorFeatureFacade(PLC plc, HMI hmi) {
		this.plc = plc;
		this.hmi = hmi;
	}
	public void gotoFloorNum(int floorNum) {
		hmi.pushFloorNum(floorNum);
		plc.sendSignalToGoOnFloor(floorNum);
	}
	
	public void ringAlarm() {
		hmi.pushAlarmButton();
		plc.sendSignalToRingAlarm();
	}
	public void stopElevator() {
		hmi.pushStopButton();
		plc.sendSignalToStopLift();
	}
}
