package com.ee;

// Elias Engström

// En basklass Publications som innehåller gemensamma variabler för books och magazines

public abstract class Publications {
    public String id;
    public String title;
    public boolean isAvailable;

    public Publications(String id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract void printInfo();
}
