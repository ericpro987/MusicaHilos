package Act2;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Conductor implements Callable<Boolean>{
	int bpm;
	ArrayList<Performer> performers;
	public Conductor(ArrayList<Performer> n, int bpm) {
		// TODO Auto-generated constructor stub
		performers = n;
		this.bpm = bpm;
	}
	@Override
	public synchronized Boolean call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep((60000 / bpm) / Note.Duration.negra);
			performers.notifyAll();
		
		return null;
	}

}
