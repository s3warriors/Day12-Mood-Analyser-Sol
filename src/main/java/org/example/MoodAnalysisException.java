package org.example;

class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        NULL_MOOD
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
