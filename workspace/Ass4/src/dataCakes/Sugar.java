package dataCakes;

@SuppressWarnings("serial")
public class Sugar extends Counter {
	public Sugar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	volatile static int cTot=0;
	void incr() {cTot+=1; c=cTot;}
}