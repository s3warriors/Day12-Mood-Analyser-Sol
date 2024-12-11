package org.example;

public class MoodAnalyser {

    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood
    public String analyseMood() {
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }

    public static void main(String[] args) {
        // TC 1.1: Sad Mood
        MoodAnalyser analyser = new MoodAnalyser("I am in a sad mood");
        System.out.println("UC1 - TC1.1 - Mood: " + analyser.analyseMood()); // Output: SAD

        // TC 1.2: Any other Mood
        analyser = new MoodAnalyser("I am in any mood");
        System.out.println("UC1 - TC1.2 - Mood: " + analyser.analyseMood()); // Output: HAPPY
    }
}
