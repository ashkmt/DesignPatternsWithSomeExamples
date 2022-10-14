package DesignPatternLearning.DesignPatternLearning.Facade;

public class HMI {

	private int currentfloor;
	public void pushFloorNum(int floorNum) {
		System.out.println("Pressed button to go on Floor:"+floorNum);
		System.out.println("Highlight Button No:"+floorNum);
	}
	public void pushAlarmButton() {
		System.out.println("Pressed button to signal Emergency");
		System.out.println("Highlight Alarm button");
	}
	public void pushStopButton() {
		System.out.println("Pressed button to Stop Lift");
		System.out.println("Highlight Stop button");
	}
	public void displayCurrentFloor(int currentfloor) {
		this.currentfloor = currentfloor;
		System.out.println("Display floor no"+currentfloor);
	}
}
