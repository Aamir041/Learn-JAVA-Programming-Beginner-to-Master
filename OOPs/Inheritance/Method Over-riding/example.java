class crtTV{
	
	public void switchOn(){
		System.out.println("CRT-TV Switched On");
	}

	public void changeChannel(int channelNum){
		System.out.println("Channel Changed to Channel Number: "+channelNum);
	}

}

class smartTV extends crtTV{

	@Override
	public void switchOn(){
		System.out.println("Smart TV Switched On");
	}

	@Override
	public void changeChannel(int channelNum){
		System.out.println("Viewed at port number : "+ channelNum);
	}

	public void browserWeb(){
		System.out.println("Browsing Website");
	}

}

public class example{
	public static void main(String[] args){
		
		crtTV ctv1 = new crtTV();
		ctv1.switchOn();
		ctv1.changeChannel(445);

		smartTV stv1 = new smartTV();
		stv1.switchOn();
		stv1.changeChannel(721);
		stv1.browserWeb();

		// Parent reference holding chid object
		crtTV ctv2 = new smartTV();
		ctv2.switchOn();
		ctv2.changeChannel(452);
		// ctv2.browserWeb(); //--> not possible

		

	}
}