package Day21_Mood_Analyzer;

public class MoodAnalyzer {

	public MoodAnalyzer() {
	}

	public String MoodAnalyzerr(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}