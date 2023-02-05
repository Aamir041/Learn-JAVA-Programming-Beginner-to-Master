class Phone{
	public void call() { System.out.println("Calling ..."); }
	public void sms() { System.out.println("Message Send."); }
}

interface ICamera{
	void click();
	void recordVideo();
}

interface IMusicplayer{
	void play();
	void pause();
}

class Smartphone extends Phone implements ICamera, IMusicplayer
{
	public void videoCall() { System.out.println("Video Calling ..."); }
	
	//  all interface methods should be over-rided or this class will become abstract class
	@Override
	public void click() { System.out.println("Photo clicked."); }
	
	@Override
	public void recordVideo() { System.out.println("Video Recorded."); }
	
	@Override
	public void play() { System.out.println("Music Playing ..."); }
	
	@Override
	public void pause() { System.out.println("Music Paused."); }

}

public class SmartphoneEx{
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.videoCall();

		Phone p = s; // points to object of Smart phone
		p.call();
		p.sms();
		// p.videoCall() -> will give error

		ICamera c = s; // points to object of Smart phone
		c.click();
		c.recordVideo();

		IMusicplayer m = s;  // points to object of Smart phone
		m.play();
		m.pause();
	}
}