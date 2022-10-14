package DesignPatternLearning.DesignPatternLearning.StrategyPattern;

public class BasicCameraApp extends AbsPhoneCameraApp{

	@Override
	public void editPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Choose option to Edit Photo");
		savePhoto();
	}

}
