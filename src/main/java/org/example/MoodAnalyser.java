package org.example;

class MoodAnalyser {

    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood with exception handling for NULL
    public String analyseMood() throws MoodAnalysisException {
        if (mood == null) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD, "Mood is null.");
        }
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }

    public static void main(String[] args) {
        // TC 2.1: NULL Mood
        try {
            MoodAnalyser analyser = new MoodAnalyser(null);
            System.out.println("UC2 - TC2.1 - Mood: " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("UC2 - TC2.1 - Exception: " + e.getType() + " - " + e.getMessage());
        }
    }


}

