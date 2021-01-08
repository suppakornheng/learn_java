import java.util.*;
public class Remote{
	protected int volume;
	protected int channel;
	protected final int MAX_VOLUME = 20;
	protected final int MAX_CHANNEL = 199;
	protected final int DEFAULT_CHANNEL = 2;
	protected final int DEFAULT_VOLUME = 5;
	protected final int MIN_VOLUME = 0;
	protected final int MIN_CHANNEL = 1;
	
	public Remote(){
		channel=DEFAULT_CHANNEL;
		volume =DEFAULT_VOLUME;
	}
	public Remote(int ch, int vol){
		channel=ch;
		volume =vol;
	}
	public void volumeUp(){
		if(volume<MAX_VOLUME){
			volume++;
		}
	}
	public void volumeDown(){
		if(volume>MIN_VOLUME){
			volume--;
		}
	}
	public void channelUp(){
		if(channel<MAX_CHANNEL){
			channel++;
		}
	}
	public void channelDown(){
		if(channel>MIN_CHANNEL){
			channel--;
		}
	}
	public void display(){
		System.out.println("\n----------------");
		System.out.println("Channel: "+channel);
		System.out.println("Volume: "+volume);
		System.out.println("----------------");
	}
	public void menu(){
		Scanner input = new Scanner(System.in);
		String choice;
		System.out.println("POWER ON");
		display();
		do{
			System.out.println("Channel up:    +");
			System.out.println("Channel down:  -");
			System.out.println("Volume up:    ++");
			System.out.println("Volume down:  --");
			System.out.println("Power off:     0");
			System.out.print("choose:        ");
			choice=input.next();
			if(choice.equals("+"))
				channelUp();
			else if(choice.equals("-"))
				channelDown();
			else if(choice.equals("++"))
				volumeUp();
			else if(choice.equals("--"))
				volumeDown();
			display();
		}while(!choice.equals("0"));
		System.out.println("POWER OFF");
	}
	public static void main(String[] args){
		Remote remote = new Remote();
		remote.menu();
	}
}