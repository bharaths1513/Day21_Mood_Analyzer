package Day21_Mood_Analyzer_Test;

import org.junit.Assert;
import org.junit.Test;

import Day21_Mood_Analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {

	@Test
	public void testingRefactor1() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
		String mood = moodAnalyzer.analyzemood();
		// Asserting The Result As Boolean Type True Or False
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void testingRefactor2() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String mood = moodAnalyzer.analyzemood();
		Assert.assertEquals("Happy", mood);
	}
}
