package Day21_Mood_Analyzer_Test;

import org.junit.Assert;
import org.junit.Test;

import Day21_Mood_Analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	@Test
	public void given_SadMood_Should_Return_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.MoodAnalyzerr("I am In a Sad Mood");
		Assert.assertEquals("SAD", mood);

	}
}
