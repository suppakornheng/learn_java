public class Undergraduate extends Student{
	private int level;
	public Undergraduate(){
		super();
		level=1;
	}
	public Undergraduate(String initName,int initNumber, int initLevel){
		super(initName,initNumber);
		level=initLevel;
	}
	public void reset(String newName,int newNum, int newlevel){
		reset(newName,newNum);
		setLevel(newlevel);
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int newLevel){
		if(1<=newLevel && newLevel<=4){
			level = newLevel;
		}else{
			System.out.println("illegal level!");
			System.exit(0);
		}
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Student level: "+ level);
	}
	public boolean equals(Undergraduate otherUndergraduate){
		return equals((Student)otherUndergraduate)&&(this.level==otherUndergraduate.level);
	}
}