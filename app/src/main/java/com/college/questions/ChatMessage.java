package com.college.questions;

public class ChatMessage {

    private String message;
    private String timestamp;
    private boolean isMine;
    public ChatMessage(String message, String timestamp, boolean isMine) {
        this.message = message;
        this.timestamp = timestamp;
        this.isMine = isMine;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public String toString() {
        return "ChatMessage{" +
                "message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", isMine=" + isMine +
                '}';
    }
}
