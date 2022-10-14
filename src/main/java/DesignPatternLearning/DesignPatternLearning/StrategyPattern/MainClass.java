package DesignPatternLearning.DesignPatternLearning.StrategyPattern;

/**
 * 
 * @author ashish
 * Problem Statement:
 *
 */
public class MainClass {

	public static void main(String args[]) {
		
		AbsPhoneCameraApp basicCameraApp = new BasicCameraApp();
		basicCameraApp.takePhoto();
		basicCameraApp.editPhoto();
		basicCameraApp.savePhoto();
		basicCameraApp.doShare(new ShareByEmail());
		
	}
}
