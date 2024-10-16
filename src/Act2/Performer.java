package Act2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Performer implements Callable<Boolean> {

	Note[] notes;

	// Minutos/Tempo/DurationNota
	public Performer(Note[] n) {
		// TODO Auto-generated constructor stub
		this.notes = n;
	}

	@Override
	public Boolean call() throws Exception {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < notes.length; i++) {
				MidiPlayer.setInstrument(MidiPlayer.getInstruments()[9]);
				wait();
				MidiPlayer.play(1, notes[i]);
				MidiPlayer.stop(0, notes[i]);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

}
