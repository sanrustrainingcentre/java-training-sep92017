
public class TennisBall extends Ball 
					implements Bounceable, Compressable {

	public void compress(int compressFactor) {
		System.out.println("Tennis Ball is compressable with CF = " + compressFactor);
	}
	
	public void bounce(int bounceFactor) {
		System.out.println("Tennis Ball can be bounced with " + bounceFactor);
	}
	
	
	
}
