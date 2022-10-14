package DesignPatternLearning.DesignPatternLearning.StrategyPattern;

/**
 * 
 * @author Ashish_Kumawat
 *	Abstract PhoneCameraApp class, this is further extended by different camera apps to
 *	implement their own editPhoto method.
 *	
 */
public abstract class AbsPhoneCameraApp {
	
	
	
	public void takePhoto() {
		System.out.println("Tap on camera Icone");
		System.out.println("Tap Ok to take Photo");
	}

	public void savePhoto() {
		System.out.println("Tap on Save icon");
		System.out.println("Choose the location to save");
	}
	
	public abstract void editPhoto();

	public void doShare(MethodToShare howToShare) {
		howToShare.share();
	}
}
