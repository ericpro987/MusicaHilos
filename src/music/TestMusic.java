package music;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.sound.midi.Instrument;

public class TestMusic {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		Note[] guitarra = { new Note(Note.Frequency.G5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter), new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter), new Note(Note.Frequency.G6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter), new Note(Note.Frequency.B6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter), new Note(Note.Frequency.C7, Note.Duration.quarter),
				new Note(Note.Frequency.G6, Note.Duration.quarter), new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter), new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.G5, Note.Duration.quarter), new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter),

				new Note(Note.Frequency.A4, Note.Duration.quarter), new Note(Note.Frequency.B4, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter), new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter), new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter), new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter), new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter), new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter), new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter),
				new Note(Note.Frequency.B4, Note.Duration.quarter) };

		Future<Boolean> futuro = executor.submit(new Performer(guitarra, 60));

		executor.shutdown();
	}
}