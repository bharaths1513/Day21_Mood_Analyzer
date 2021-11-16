package Day21_Mood_Analyzer;

public class MoodAnalyzer {
	String message;

	// Refactor assigning message in parameterized constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzemood() {
		if (this.message.contains("Sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

}
