package org.example;

// Custom Exception Class
class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        EMPTY_MOOD
    }

    private final ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}