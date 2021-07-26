package com.sayyidisal.movieapp.model;

import com.google.gson.annotations.SerializedName;

public class ModelReview {
    private String eventId;
    private String eventName;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
