package Act2;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.sound.midi.Instrument;
import music.Note;
import music.Performer;

public class TestMusic
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newCachedThreadPool();

		Note[] guitarra =
			{
				new Note(Note.Frequency.G5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter),
				new Note(Note.Frequency.G6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter),
				new Note(Note.Frequency.B6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter),
				new Note(Note.Frequency.C7, Note.Duration.quarter),
				new Note(Note.Frequency.G6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.G5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter),
				
				new Note(Note.Frequency.A4, Note.Duration.quarter),
				new Note(Note.Frequency.B4, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter),
				new Note(Note.Frequency.B4, Note.Duration.quarter)
			};
		Note[] piano=
			{
				new Note(Note.Frequency.G5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter),
				new Note(Note.Frequency.G6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter),
				new Note(Note.Frequency.B6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter),
				new Note(Note.Frequency.C7, Note.Duration.quarter),
				new Note(Note.Frequency.G6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.D6, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.G5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.D5, Note.Duration.quarter),
				
				new Note(Note.Frequency.A4, Note.Duration.quarter),
				new Note(Note.Frequency.B4, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.A6, Note.Duration.quarter),
				new Note(Note.Frequency.E6, Note.Duration.quarter),
				new Note(Note.Frequency.C6, Note.Duration.quarter),
				new Note(Note.Frequency.B5, Note.Duration.quarter),
				new Note(Note.Frequency.A5, Note.Duration.quarter),
				new Note(Note.Frequency.E5, Note.Duration.quarter),
				new Note(Note.Frequency.C5, Note.Duration.quarter),
				new Note(Note.Frequency.B4, Note.Duration.quarter)
			};
		ArrayList<Future<Boolean>> listFuture = new ArrayList<Future<Boolean>>();
		Future<Boolean> futuro1 = executor.submit(new Performer(guitarra, 60));
		
		executor.shutdown();
	}
}
