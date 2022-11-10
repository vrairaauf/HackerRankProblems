public class Threading {
	public static void main(String[] args){
		/* multithreading with java language */
		Calc c1=new Calc(1, 2);
		Calc c2=new Calc(3, 4);

		c1.start();
		c2.start();
	}


}
class Calc extends  Thread{
	private int x;
	private int y;
	private int sum;
	public Calc(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void setx(int x){
		this.x=x;
	}
	public void sety(int y){
		this.y=y;
	}
	public int getx(){
		return this.x;
	}
	public int gety(){
		return this.y;
	}
	public int appendValue(int x){
		return this.getSum()+x;
	}
	private int getSum(){
		return this.x+this.y;
	}
	@Override
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName()+"using threading in java");
		}
		
	}
}