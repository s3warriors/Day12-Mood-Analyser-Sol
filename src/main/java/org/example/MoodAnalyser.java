package org.example;

class MoodAnalyser {

    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood with exception handling for EMPTY
    public String analyseMood() throws MoodAnalysisException {
        if (mood == null || mood.trim().isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD, "Mood is empty.");
        }
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }

    public static void main(String[] args) {
        // TC 3.1: EMPTY Mood
        try {
            MoodAnalyser analyser = new MoodAnalyser("");
            System.out.println("UC3 - TC3.1 - Mood: " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("UC3 - TC3.1 - Exception: " + e.getType() + " - " + e.getMessage());
        }

        // TC 3.2: Valid Mood
        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in a happy mood");
            System.out.println("UC3 - TC3.2 - Mood: " + analyser.analyseMood()); // Output: HAPPY
        } catch (MoodAnalysisException e) {
            System.out.println("UC3 - TC3.2 - Exception: " + e.getType() + " - " + e.getMessage());
        }
    }


}

