package DesignPatternLearning.DesignPatternLearning.Facade;

public class PLC {

	public int sendSignalToGoOnFloor(int floorNum) {
		System.out.println("Going on floor:"+floorNum);
		return floorNum;
	}
	public int sendSignalToStopLift() {
		System.out.println("Stopping lift");
		return -1;
	}
	public void sendSignalToRingAlarm() {
		Alarm.ringAlarm();
	}
}
